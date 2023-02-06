package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
	private List<Card> dealersHand = new ArrayList<>();
	private Deck deck = new Deck();
	private int sum = 0;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void shuffleDeck() {
		deck.shuffle();
	}

	public void checkDeckSize() {

	}

	public List<Card> hit(List<Card> hand) {
		deck.shuffle();
		hand.add(deck.dealCard());
		return hand;
	}

	public List<Card> dealerHit() {
		hit(dealersHand);
		return dealersHand;
	}

	public void dealersInitialHandOfCards() {
		dealersHand.add(deck.dealCard());
		dealersHand.add(deck.dealCard());

		System.out.println("Dealer's hand is: " + dealersHand.get(0) + " and other unknown card");
	}

	public void calcDealersScore() {
		for (Card card : dealersHand) {
			sum += card.getRank().getValue();
		}
//		System.out.println("Dealer's score is " + sum);

	}

	public void dealerDisplayCards() {
		System.out.println("The dealer's cards are: ");
		for (int i = 0; i < dealersHand.size(); i++) {
			System.out.println(dealersHand.get(i));
		}
	}

	public void displayDealerScore() {
		System.out.println("Dealer's Score is: " + sum);
	}

	public void dealersTurn() {
		if (getSum() > 17 && getSum() < 21) {
			System.out.println("Dealer Stands");
			dealerDisplayCards();
			System.out.println(" ");
			displayDealerScore();
			System.out.println(" ");
		} else {
			while (getSum() < 17) {//
				dealerDisplayCards();
				System.out.println(" ");
				System.out.println("Dealer Hits");//
				System.out.println(" ");
				dealerHit();
				calcDealersScore();
				dealerDisplayCards();
				System.out.println(" ");
				System.out.println("Dealer's Final Score :" + getSum());
				if (getSum() > 21) {
					System.out.println("House Busts! You Win!");
				}
				continue;
			}

		}
	}
}
