// Card.java
// Class definition for a card type

import java.lang.Math.*;

public class Card implements Cloneable{
  
    public enum Suits{spades,hearts,clubs,diamonds}

    private int face;
    private Suits suit;

    final static int ACE =1;
    final static int JACK =11;
    final static int QUEEN =12;
    final static int KING =13;

    //Constructors
    public Card ()
	//null constructor randomly generates a card
    {
	face = (int)(Math.random()* 13) +1;
	switch((int)(Math.random()* 4))
	    {case 0: suit = Suits.spades;
		  break;
	    case 1: suit = Suits.hearts;
		break;
	    case 2: suit = Suits.clubs;
		break;
	    case 3: suit = Suits.diamonds;
		break;
	    }
    }
      
    public Card (Suits s, int f)
	// initializes suit_type=>s, face=>f
    {  suit =s;
    face = f;
    }
	  
    //accessors
    public Suits getSuit ()
    {return suit;}  // suit of the card

    public int getFace ()
    {return face;} // returns face value of card			      
 
    //Function to display card
    public void printcard()
    {
	System.out.print("The card is ");
	if (face > 1 && face <= 10)
	    System.out.print(face);
	else
	    {if (face == ACE) System.out.print("A");
	    else if (face == JACK) System.out.print("J");
	    else if (face == QUEEN) System.out.print("Q");
	    else System.out.print("K");
	    }
  
	System.out.print(" of ");
	switch (suit)
	    {
	    case spades:
		System.out.print("S");
		break;
	    case hearts:
		System.out.print("H");
		break;
	    case clubs:
		System.out.print("C");
		break;
	    case diamonds:
		System.out.print("D");
		break;
	    }
	System.out.println();
    }

  
    //function to test equality
    public boolean equals (Object c1)
    {
	return (c1 instanceof Card && ((Card)c1).face == face && ((Card)c1).suit == suit);
    }

    //function to test same suit
    public boolean same_suit (Card c1)
    {
	return (c1.suit == suit);
    }

    //toString
    public String toString()
    { return face + " of " + suit;
    }

    //clone
    public Object clone()
    {
	Card cloned = new Card(suit,face);
	return cloned;
    }
}



