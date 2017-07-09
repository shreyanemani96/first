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
 	    System.out.println("Enter the last number");
        int number= s.nextInt();
        int a=0;
        for(int i=1;i<=number;i++)
        {
            a=a+i;
        }
        System.out.println(a);
	}
}