//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week05OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card firstCard = new Card(CardSuit.Spades);
		//Just testing the other constructor
		Card secondCard = new Card(CardName.Ace, CardSuit.Hearts);
		
		// Call the describe method on the newly instantiated card.
		firstCard.describe();
		secondCard.describe();
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck	
	    Deck firstDeck = new Deck();
	    
	    // Call the describe method on the newly instantiated deck.
	    firstDeck.describe();
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		firstDeck.shuffle();
		
		
		// Call the describe method on the newly shuffled deck.
		firstDeck.describe();
		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here
		Card firstDraw = firstDeck.drawCard();
		//Overriding the toString method for Card makes this look prettier.
		System.out.println("First Card Drawn is: " + firstDraw);
		firstDeck.describe();

		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		Map<String, List<Card>> playerHands = dealToPlayers(5,5);
		Set<String> players = playerHands.keySet();
		//Since sets aren't ordered, let's make a list and sort the keys so we print in player-number order.
		List<String> pList = new ArrayList<>(players);
		pList.sort(null);
		for(String s : pList) {
			System.out.println(s + "'s Hand:");
			System.out.println(playerHands.get(s));
		}
		
		
		
		
		
		
		
	} 
	
	// Method 5:
	public static Map<String, List<Card>> dealToPlayers(int numberOfPlayers, int cardsPerPlayer) {
		Map<String, List<Card>> playerHands = new HashMap<>();
		Deck deck = new Deck();
		//Let's create the players and lists in the map
		for(int i=1; i<=numberOfPlayers; i++) {
			playerHands.put(String.format("Player%02d", i), new ArrayList<Card>());
		}
		//Now we have everything set up, we need to shuffle the deck...
		deck.shuffle();
		//Then deal the cards out to all the players, 1 at a time
		//We'll want to get a list of keys for the map first
		Set<String> players = playerHands.keySet();
		//Since a set isn't ordered, let's make a list of the keys and sort them so the cards are dealt in order.
		List<String> pList = new ArrayList<>(players);
		pList.sort(null);
		for(int c = 0; c < cardsPerPlayer; c++) {
			for(String s : pList) {
				playerHands.get(s).add(deck.drawCard());
			}
		}
		
		//Finally, return the map
		return playerHands;
	}
	
	
	

}