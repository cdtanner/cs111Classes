//UseCard.java
//cs111 sample program to use the card class


public class UseCard
{
    public static void main(String [] agrs)
    {
	Card c5 = new Card(Card.Suits.spades,1);
	Card c1= new Card(); 
	Card c2= new Card(Card.Suits.spades,12);
	Card c3 = new Card(Card.Suits.spades,11); 
	Card c4 = new Card(Card.Suits.spades,12);
	Card[] hand = new Card[5];
	int i;
	
	c1.printcard();
	System.out.println();
	c3.printcard();
	System.out.println();
	
	//check same suit
	if (c1.same_suit (c2))
	    System.out.println("luck of the draw");
	else  System.out.println("can't buy a card today");
	
	//check equal
	if (c2.equals(c4))
	    System.out.println("There's some cheating going on");
	
	if (c3.same_suit(c4) && c3.same_suit(c2))
	    System.out.println("On the way to a flush");
	
	//deal 5 cards
	for (i=0;i<5;i++)
	    hand[i] = new Card();
  
	System.out.println("you were dealt ==> ");
	for (i=0;i<5;i++)
	    {System.out.print("\t");
	    hand[i].printcard(); 
	    }

	//test to string
	System.out.println("your last card is: " + hand[4].toString());

	//test clone
	Card c = (Card)hand[4].clone();
	System.out.println ("C is: " + c.toString());
	c = new Card();
	System.out.println ("c is the new card: " + c.toString());
	System.out.println("your last card still is: " + hand[4].toString());
    }
}
