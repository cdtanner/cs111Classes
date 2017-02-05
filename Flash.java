import java.util.Scanner;

public class Flash
{
  public static Scanner sc=new Scanner(System.in);
  
  public static void main(String [] agrs)
  {
    Problem prob;
    char play;
    int answer;
    
    System.out.print("Do you wish a flash card problem? Y/N");
    play = sc.next().charAt(0);
    while (play == 'Y' || play == 'y')
    {
      prob = new Problem();
      //prob.displayProblem();
      System.out.print(prob);
      answer = sc.nextInt();
      if (answer == prob.correctAnswer())
        System.out.println ("GREAT JOB YOU GOT IT RIGHT!!!!!!");
       else System.out.println ("Sorry, incorrect, try again!");
    System.out.print("Do you wish a flash card problem? Y/N");
    play = sc.next().charAt(0);
    }
  }
}