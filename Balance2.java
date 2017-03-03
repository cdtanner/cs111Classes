//Balance2.java
//CS 111 sample program using collections class stack
//to check for  balanced parens
//declares and throws an exception

import java.util.Stack;
import java.util.Scanner;

public class Balance2
{

    public static class ParenOutOfBalanceException extends Exception
    { 
	public ParenOutOfBalanceException ( String message)
	{ super(message);}
    }

    public static void balance (String s) throws ParenOutOfBalanceException
    {  
	    Stack<Character> paren = new Stack<Character>();
	    int i;
		for (i=0;i<s.length();i++)
		    {if (s.charAt(i)=='(')
			paren.push(s.charAt(i));
		    else
			{if (s.charAt(i)==')')
			    if (!paren.empty())
				paren.pop();
			    else
				throw new ParenOutOfBalanceException("within");
			}
		    }
		//anything left on the stack?
		if (!paren.empty())
		    throw new ParenOutOfBalanceException("at end");
    }


    public static void main(String [] args)
    {
	int i;
	String s;

	Scanner sc = new Scanner(System.in);

	System.out.println ("enter an expression: (CRTL D to end)");
	while (sc.hasNext())
	    {   
		s = sc.next();
		System.out.println("the expression entered: " +  s);
		try
		    { balance(s);
		      System.out.println("the expresion has balanced parentheses");
		    }
		catch (ParenOutOfBalanceException e)
		    { System.out.println ("Mismatched Parentheses: " +e.getMessage());}

		System.out.println ("enter an expression:(Ctrl D to end)");
	    }
    }
}
