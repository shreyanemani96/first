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
		System.out.println("Enter the input");
        char letter= s.next().charAt(0);
        if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z'))
        {
        	
        	System.out.println("It is an alphabet");
        }
        else
        { 
        	System.out.println("Not an alphabet");
        }	
	}
}