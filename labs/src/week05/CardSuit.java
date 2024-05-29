package week05;

//I decided to use an enum for the card suit (same as name) for 2 reasons:
//1. Limit the number of options for a card, so I don't have to error check as much
//2. You can use CardName.values() like a list to iterate in an enhanced for loop to build the deck.
public enum CardSuit {
	Hearts, Clubs, Spades, Diamonds
}
