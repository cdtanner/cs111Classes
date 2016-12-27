public class CreditCard
{
    private String name;
    private String accountNumber;
    private double balance;
    private Date dueDate;
    private int rewardPoints;
    

    public CreditCard(String n, String num)
    {
	name = new String(n);
	accountNumber= num;
	balance =0;
	rewardPoints =0;
	dueDate = new Date (system.today);
    }

    public String getName();
    public double getBalance();
    public String getAccpuntNumber();
    public int getRewardPoints();
    public Date getDueDate();
    

    public void purchase(double amount);
    public void payOnAccount(double amount);
    public void cashAdvance(double amount);
    public void addInterest();

    public String toString();
    public void displayAccount();
}