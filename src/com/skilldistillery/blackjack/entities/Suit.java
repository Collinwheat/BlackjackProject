package com.skilldistillery.blackjack.entities;

public enum Suit {
	
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	private String name;
	
	Suit(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	// create hearts, spades, clubs diamonds
	// name field
	// reference Day Class in drills

}
