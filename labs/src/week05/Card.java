package week05;

import java.util.Random;


public class Card {
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
	private final CardName name;
	private final CardSuit suit;
	private int value;
	
	//This constructor will be useful for building a deck so you can specify the card.
	public Card(CardName name, CardSuit suit) {
		this.name = name;
		this.suit = suit;
		valueFromName();
	}
	
	//This constructor calls the above constructor but uses a random number generator to select the name.
	public Card(CardSuit suit) {
		this(generateName(),suit);
	}
	
	//Name getter
	public CardName getName() {
		return name;
	}

	//Suit getter
	public CardSuit getSuit() {
		return suit;
	}
	
	//This is a helper function that generates a random number between 2 and 14, 
	//then sets the name field to the equivalent enumeration.
	private static CardName generateName() {
		Random num = new Random();
		CardName name;
		switch(num.nextInt(2,15)) {
		case 2:
			name = CardName.Two;
			break;
		case 3:
			name = CardName.Three;
			break;
		case 4:
			name = CardName.Four;
			break;
		case 5:
			name = CardName.Five;
			break;
		case 6:
			name = CardName.Six;
			break;
		case 7:
			name = CardName.Seven;
			break;
		case 8:
			name = CardName.Eight;
			break;
		case 9:
			name = CardName.Nine;
			break;
		case 10:
			name = CardName.Ten;
			break;
		case 11:
			name = CardName.Jack;
			break;
		case 12:
			name = CardName.Queen;
			break;
		case 13:
			name = CardName.King;
			break;
		default:
			name = CardName.Ace;
			break;
		}
		return name;
	}

	//Uses the name field to calculate a value for comparison.
	//Comparison value wasn't used in the code, but was mentioned to have the value field.
	private void valueFromName() {
		switch(name) {
			case Two:
				value = 2;
				break;
			case Three:
				value = 3;
				break;
			case Four:
				value = 4;
				break;
			case Five:
				value = 5;
				break;
			case Six:
				value = 6;
				break;
			case Seven:
				value = 7;
				break;
			case Eight:
				value = 8;
				break;
			case Nine:
				value = 9;
				break;
			case Ten:
				value = 10;
				break;
			case Jack:
				value = 11;
				break;
			case Queen:
				value = 12;
				break;
			case King:
				value = 13;
				break;
			case Ace:
				value = 14;
				break;
			default:
				value = 0;
				break;
		}
	}
	
	//The describe method will print a long version of the string, using words not nnumbers and symbols
	public void describe() {
		System.out.println(this.toLongString());
	}
	
	//Decided to override the toString method and return a 2-3 character string to represent the card
	//Uses 2-10, J, Q, K, A for the name, and the unicode symbol for the suit.  Looks nicer when printing arrays/lists.
	@Override
	public String toString() {
		String s = "";
		String club = String.format("%c",  0x2663);
		String spade = String.format("%c",  0x2660);
		String diamond = String.format("%c",  0x2666);
		String heart = String.format("%c",  0x2665);
		if(value <= 10) {
			s = String.format("%d", value);
		} else if(value == 11) {
			s = "J";
		} else if(value == 12) {
			s = "Q";
		} else if(value == 13) {
			s = "K";
		} else if(value == 14) {
			s = "A";
		}
		switch(suit) {
		case Clubs:
			s += club;
			break;
		case Spades:
			s += spade;
			break;
		case Diamonds:
			s += diamond;
			break;
		default:
			s += heart;
			break;
		}
		return s;
	}
	
	//This was actually my first toString override before I made the "fancy" one above.
	//I changed the name to toLongString and used in in the description method.
	public String toLongString() {
		return name.toString() + " of " + suit.toString();
	}

	//Basically taking the compare method and leveraging it to override the .equals method.
	@Override
    public boolean equals(Object o) {
		//First let's make sure it's not actually the same memory location (same object)
        if (o == this) {
            return true;
        }

        //Then let's make sure the object we are comparing to is the same class that we are.
        if (!(o instanceof Card)) {
            return false;
        }
         
        //Finally, we cast the object to a Card and call on Integer.compare to do the comparison for us.
        //If the integer values of the two are the same, compare will return 0;
        Card c = (Card) o;
        return Integer.compare(value, c.value) == 0;
    }
	
	//Also created a compare method.  Not used yet, but could be handy later.
    public int compare(Card c) {
   	 	//Same as above, we can return quickly if we are comparing to ourselves.
        if (c == this) {
            return 0;
        }
        //Simply call Integer.compare with the values and return the result.  
        return Integer.compare(value, c.value);
    }
	
	
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
}
