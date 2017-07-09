/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum,remainder;
		Scanner s= new Scanner(System.in);
 	    System.out.println("Enter the number");
        int number= s.nextInt();
        for(sum=0;number>0;number=number/10)
        {
            remainder=number%10;
            sum=sum+remainder;
        }
        System.out.println(sum);
    }
}