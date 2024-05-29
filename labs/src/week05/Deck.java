package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
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
	
	List<Card> cards = new ArrayList<>();
	
	public Deck() {
		for(CardSuit suit : CardSuit.values()) {
			for(CardName name : CardName.values()) {
				cards.add(new Card(name, suit));
			}
		}
	}
	
	public void describe() {
		System.out.println("Deck Contains " + cards.size() + " cards:");
		for(Card c : cards) {
			System.out.println("  " + c.toString());
		}
	}
	
	//This may not be memory efficient, but we'll use the random number generator to pull a random card out of the deck
	//and add it to a new deck.  We'll loop this until all cards are out of the original deck, then assign cards to the new deck.
	public void shuffle() {
		List<Card> postShuffle = new ArrayList<>();
		Random num = new Random();
		
		while(cards.size() > 0) {
			postShuffle.add(cards.remove(num.nextInt(0,cards.size())));
		}
		cards = postShuffle;
	}
	
	public Card drawCard() {
		return cards.remove(0);
	}
}
