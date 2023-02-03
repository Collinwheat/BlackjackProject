package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();
	
	
	public int NUMBER_OF_CARDS_IN_A_DECK = 52;
	
		
	//responsible for the creation of 52 cards, and storing them in a list of cards
	
	private List<Card> Deck() {
		
		Suit [] suits = Suit.values();
		Rank [] ranks = Rank.values();
		
			for (Rank rank : ranks) {
				for (Suit suit : suits) {
					Card card = new Card(suit, rank);
					deck.add(card);
				}
				
			}
		return deck;
			
		}
	
	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
		
		
	
	private void checkDeckSize() {
		
	}
	
	private void dealCard() {
		
	}
	
	private void shuffle() {
		
	}
	
}
