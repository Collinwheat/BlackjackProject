package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		BlackJackApp bj = new BlackJackApp();
		Dealer dealer = new Dealer();
		Player player = new Player();
		Scanner input = new Scanner(System.in);

		dealer.shuffleDeck();
		player.receiveInitialCardsFromDealer();
		System.out.println("Your current hand is: " + player.receiveInitialCardsFromDealer());
		System.out.println(" ");
		dealer.dealersInitialHandOfCards();
		System.out.println(" ");
		System.out.println("What would you like to do? (Input number of menu item)");

		bj.displayMenu();
		int selection = input.nextInt();

		while (selection != 2) {
			bj.displayMenu();
			player.playerHit();
			player.displayPlayerHand();
			selection = input.nextInt();
			System.out.println(" ");
		}
		player.calcPlayerScore();
		System.out.println(" ");
		if (player.getSum() > 21) {
			System.out.println("Player Busts, House Wins!");
		} else if (player.getSum() == 21) {
			System.out.println("$$$$ You Won! $$$$");
		} else {
			dealer.dealersTurn();
			if (dealer.getSum() > player.getSum() && dealer.getSum() <= 21) {
				System.out.println("Dealer Wins!");
			} else {
				System.out.println("Player Wins!");
			}
		}
	}

	public void displayMenu() {
		System.out.println("|-------------|");
		System.out.println("|    1.Hit    |");
		System.out.println("|    2.Stay   |");
		System.out.println("|-------------|");
	}

}
