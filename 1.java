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
		System.out.println("Enter the number");
		
		int number= s.nextInt();
		if(number<0)
		{
			System.out.println("The number is negative");
		}
		else if(number>0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is zero");
		}
	}
}