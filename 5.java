/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number1");
        int number1= s.nextInt();
        System.out.println("Enter the number2");
        int number2= s.nextInt();
        System.out.println("Enter the number3");
        int number3= s.nextInt();
        if(number1>number2)
        {
        	if(number1>number3)
        	{ 
        	 System.out.println("Number1 is greatest");
        	}
        	else 
        	{ 
        	 System.out.println("Number3 is greatest");
        	}
        }
        else if(number2>number1)
        {
        	if(number2>number3)
        	{ 
        	 System.out.println("Number2 is greatest");
        	}
        	else 
        	{ 
        	 System.out.println("Number3 is greatest");
        	}
        }
        else 
        {
        	System.out.println("Number3 is greatest");
        }
	}
}