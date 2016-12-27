//Blackjack.java
//CS 111 Sample Program to use the Card class and play a
// players dream version of blackjack
//does not follow casino rules!

public class Blackjack
{
  enum PlayerType {player, dealer}; 

  public static int cardValue (Card c)
  { int value;
     if (c.getFace()==Card.JACK || c.getFace()==Card.QUEEN || c.getFace()== Card.KING)
         value = 10;
      else value = c.getFace();
     return value;
  }

  public static void main(String [] args)
  {
      Card[] playersHand = new Card[2];
      Card []dealersHand = new Card[2];
      Card newCard;
      int i,j;
      int[] totalHand= new int[2];
      char play ='y';
      while (play =='y' || play =='Y')
	  {
	      //deal each hand two cards
	      for (i=0;i<2;i++)
		  {playersHand[i] = new Card();
		  dealersHand[i]= new Card();
		  totalHand[i]=0;
		  }

	      System.out.println("players cards dealt: ");
	      for (i=0;i<2;i++)
		  playersHand[i].printcard();
	
	      System.out.println("dealers cards dealt: ");
	      for (i=0;i<2;i++)
		  dealersHand[i].printcard();

	      //evaluate hands
	      for (i =0;i<2;i++)
		  { totalHand[0]+= cardValue(playersHand[i]);
		  totalHand[1]+= cardValue(dealersHand[i]);
		  }
     
	      for (PlayerType p : PlayerType.values())
		  {switch (p)
		      {case player: System.out.println ("player draws: "); break;
		      case dealer: System.out.println("dealer draws: "); break;
		      }
		  while (totalHand[p.ordinal()] < 17)
		      { newCard =new  Card();
		      newCard.printcard();
		      totalHand[p.ordinal()]+=cardValue(newCard);
		      }
		  }

	      System.out.println ("player has " + totalHand[PlayerType.player.ordinal()]);
	      System.out.println ("dealer has " + totalHand[PlayerType.dealer.ordinal()]);

	      if (totalHand [PlayerType.dealer.ordinal()] >21)
		  System.out.println ("player wins");
	      else if (totalHand[PlayerType.player.ordinal()] < 22 && 
		       totalHand[PlayerType.player.ordinal()] > totalHand[PlayerType.dealer.ordinal()]) 
		  System.out.println ("player wins");
	      else if (totalHand[PlayerType.dealer.ordinal()] == totalHand[PlayerType.player.ordinal()])
		  System.out.println("push");
	      else System.out.println ("dealer wins");
	      System.out.print ("wish to try your luck again? ");
	      try
		  {play = (char) System.in.read();
		  System.in.skip(1);
		  }
	      catch (java.io.IOException e)
		  {System.out.println("needed to enter a y or n \nI guess you don't want to play anymore");
		  play = 'n';
		  }
	  }
  }
}
