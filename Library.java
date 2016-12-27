import java.util.Scanner;
import java.util.Calendar;


public class Library
{

  private LibraryItem [] library;
  private int numItems;
  private enum displayType {all, books, reference, cds, dvds};
  
    static Scanner sc = new Scanner(System.in);
  
    public Library()
  {   library = new LibraryItem[100];
      numItems=0;
  }
  
    public static int menu() 
  {
    int choice;
    
    System.out.println ("Add items to the Library:                1");
    System.out.println ("Display # of Items in the Library        2");
    System.out.println ("Display all Items in the Library         3");
    System.out.println ("Display the reference Books              4");
    System.out.println ("Search for an Item                       5");
    System.out.println ("Borrow an Item                           6");
    System.out.println ("Return an Item                           7");
    System.out.println ("Renew an Item                            8");
    System.out.println ("Display all checked out items            9");
    System.out.println ("Display all overdue items               10");
    System.out.println ("Exit                                    11");
    System.out.println ("\nEnter your choice: ");
    choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }
    public int getNumItems()
    {
	return numItems;
    }

  public void addBook()
  { 
      String title, author, isbn;
      System.out.print("Enter isbn: ");
      isbn = sc.nextLine();
    System.out.println ("Enter the Book's title: ");
    title = sc.nextLine();
    System.out.println("Enter the Book's Author: ");
    author = sc.nextLine();
    library[numItems] = new Book (isbn,title, author);
    numItems++;
  }
  
  public void populate()
  {  int i;
    System.out.println ("Add a Book                          1");
    System.out.println ("Add a Reference Book                2");
    System.out.println ("Add a CD                            3");
    System.out.println ("Add a DVD                           4");
    System.out.println ("Enter Choice: ");
    i = sc.nextInt();
    sc.nextLine();
    switch (i)
    {
      case 1: addBook();
              break;
    }
 }
    public String toString(int i)
    {
	String result ="";
	return result+= library[i].toString();
    }
  public void displayCollection (displayType type) 
  {
    int i;
    switch (type)
    { case all: for (i=0;i< numItems;i++)
                                   System.out.println(library[i]);
                                 break;
    }   
  }
  
  public int search(String isbn) 
    { int i;
	boolean found = false;
	for (i =0; !found && i < numItems; i++)
		 if (isbn.equals(library[i].getIsbn()))
		     found =true;
	if (!found)
	    i=-1;
	else 
	    i--;
	return i;
    }
  public void takeBack() {}
  public void renew() {}
  public void borrow() 
    {  String isbn;

	int i;
	System.out.print("enter isbn: ");
	isbn = sc.next();
	i = search(isbn);
	if (i == -1)
	    System.out.println("Item not in this library");
	else library[i].borrow();
   }
  public void overdue() {}
  public void checkedOut() {}
  
  public static void main(String [] args)
  {

    int i;
    String is;
    int choice = 0;
    Library thisLibrary = new Library();
    choice = menu();      
    while (choice !=11) 
    { switch (choice)
      {
      case 1: thisLibrary.populate();
              break;
      case 2: System.out.println ("There are " + thisLibrary.getNumItems() + " items in the library");
              break;
      case 3: thisLibrary.displayCollection(displayType.all);
              break;
      case 4: thisLibrary.displayCollection(displayType.reference);
              break;
      case 5: System.out.print("enter isbn");
	      is=sc.next();
	      i =thisLibrary.search(is);
	      if (i==-1) System.out.println("Not in the lIbrary");
	      else System.out.println(thisLibrary.toString(i));
	      break;
      case 6: thisLibrary.borrow();
              break;
      case 7: thisLibrary.takeBack();
              break;
      case 8: thisLibrary.renew();
              break;
      case 9: thisLibrary.checkedOut();
              break;
      case 10: thisLibrary.overdue();
               break;
      case 11: break;
      default: System.out.println ("Invalid Option, please retry");
     }
    choice = menu();
    }
  }
}