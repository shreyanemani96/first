/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,a=0;
		Scanner s= new Scanner(System.in);
 	    System.out.println("Enter the number");
        number= s.nextInt();
        if(number<0)
        {
            number=number*-1;
        }
        else if(number==0)
        {
        	number=1;
        }
        while(number>0)
        {
           number=number/10;
           a++;
        }
        System.out.println(a);
    
	}
}