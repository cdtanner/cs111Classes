public class UseFood
{

    public static void main(String [] args)
    {
	Food [] meal= new Food[3];
	meal[0] = new Veggie ("carrot sticks", 10);
	meal[1]= new Meat ("chicken", 5);
	meal[2] = new Veggie ("avacado", 100);
 
	for (int i =0; i<3; i++)
	    System.out.println (meal[i]);

	meal[2].setCalories(125);
	System.out.println(meal[2]);
   }
}
