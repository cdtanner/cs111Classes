import java.util.Calendar;

public abstract class LibraryItem
{
    private String isbn;
    private Date dueDate;
    private int loanPeriod;
    private boolean onLoan;



    public LibraryItem(String i,int lp)
    {
	System.err.println("In Library Item");
	isbn=i;
      onLoan = false;
      dueDate =new Date (0,0,0);
      loanPeriod =lp;
    }

    public LibraryItem(String i)
    {
	isbn=i;
      onLoan = false;
      dueDate = new Date(0,0,0);
      loanPeriod=0;
    }

    public boolean getOnLoan()
    { return onLoan;}

    public int getLoanPeriod()
    { return loanPeriod;}

    public Date getDueDate()
    { return dueDate;}

    public String getIsbn()
    { return isbn;}

    
    public void setLoanPeriod(int lp)
    { loanPeriod = lp;}



    public void takeBack()
    {
      
      Calendar cal = Calendar.getInstance();
      Date today = new Date(cal.get(Calendar.DAY_OF_MONTH), (int)cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
      if (dueDate.compareTo(today) <= 0)
        System.out.println("Overdue, please pay fine!");
      onLoan = false;
      dueDate = new Date(0,0,0);
    }

    public void borrow()
    {
      Calendar cal = Calendar.getInstance();
      Date today = new Date(cal.get(Calendar.DAY_OF_MONTH), (int)cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
      
      if (!onLoan && loanPeriod != 0)
      {for (int i = 1; i<=loanPeriod; i++)
        today.advance();
       dueDate = new Date (today.getMonth(), today.getDay(), today.getYear());
      onLoan = true;
      System.out.println ("Date due Back: " + dueDate);
     }
      else System.out.println("Already Checked out or the item is not allowed out of the library, Sorry!");
    }

    public void renew()
    {
      Calendar cal = Calendar.getInstance();
      Date today = new Date(cal.get(Calendar.DAY_OF_MONTH), (int)cal.get(Calendar.MONTH)+1,cal.get(Calendar.YEAR));
      
      if (onLoan && loanPeriod !=0)
      {for (int i = 1; i<=loanPeriod; i++)
        today.advance();
	dueDate = new Date (today.getMonth(), today.getDay(), today.getYear());
       System.out.println ("Date due Back: " + dueDate);
      }
      else System.out.println("Error item not already checked out!");
    }

    public String toString()
    {  return "Due Date: " + dueDate + "\nOn Loan: " + onLoan + 
    "\nLoan Period" + loanPeriod;}
}
    
