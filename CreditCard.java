public class CreditCard
{
    private String name;
    private String accountNumber;
    private double balance;
    private Date dueDate;
    private int rewardPoints;
    public static final double INTEREST_PERCENT=.04;

    public CreditCard(String n, String num)
    {
      name = new String(n);
      accountNumber= num;
      balance =0;
      rewardPoints =0;
      dueDate = new Date (system.today);
    }

    public String getName()
    {
      return name;
    }
    public double getBalance()
    {
      return balance;
    }
    public String getAccountNumber()
    {
      return accountNumber;
    }
    public int getRewardPoints()
    {
      return rewardPoints;
    }
    public Date getDueDate()
    {
      return dueDate;
    }
    

    public void purchase(double amount)
    {
      balance += amount;
    }
    public void payOnAccount(double amount)
    {
      balance -= amount;
    }
    public void cashAdvance(double amount)
    {
      balance += amount;
    }
    public void addInterest()
    {
      balance += balance*INTEREST_PERCENT;
    }

    public String toString()
    {
      return name +"\n" + accountNumber + "\n" + balance;
    }
    public void displayAccount()
    {
      System.out.println ("Name: " + name);
      System.out.println ("Account Number: " + accountNumber);
      System.out.println ("Due Date: " + dueDate);
      System.out.println ("Reward Points: " + rewardPoints);
      System.out.println ("Balance: " + balance);
    }
}
      
      
}