package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Deck;

public class DealingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deal 5 cards from deck, displaying each of the delt cards
		
		DealingCards dealer = new DealingCards(); 
			dealer.deal();
		
	}
	
	public void deal() {
		Deck theDeck = new Deck();
		System.out.println(theDeck.getDeck().size);
	}

}
