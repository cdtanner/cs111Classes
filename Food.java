public abstract class Food
{
    private String name;
    private double calories;

    public abstract double percentProtein();
    public abstract double percentFat();
    public abstract double percentCarbohydrates();

    public double getCalories() {return calories;}
    public String getName() {return name;}
 
    public Food (String n, double c)
    {
	name = n;
	calories =c;
    }
    public String toString()
    {
	return "Food Item: " + name + "\t" + calories +"\n" + percentFat();
    } 
    public void setCalories(double cal)
    { calories = cal;}
    
}
