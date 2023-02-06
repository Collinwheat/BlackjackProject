package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> playersHand = new ArrayList<>();
	private int sum = 0;
	Dealer dealer = new Dealer();

	// receive cards method
	public List<Card> receiveInitialCardsFromDealer() {
		dealer.hit(playersHand);

		return playersHand;
	}

	public List<Card> playerHit() {
		dealer.hit(playersHand);
		return playersHand;
	}

	public void displayPlayerHand() {
		for (int i = 0; i < playersHand.size(); i++) {
			System.out.println(playersHand.get(i));
		}
	}

	public void calcPlayerScore() {
		for (Card card : playersHand) {
			sum += card.getRank().getValue();

		}
		System.out.println("Your Score is: " + sum);
	
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
