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
		System.out.println("Enter the letter");
		char letter= s.next().charAt(0);
		switch(letter)
		{
		case 'a':
		{ 
			System.out.println("It is a vowel");
			break;
		}
		case 'e':
		{ 
			System.out.println("It is a vowel");
			break;
		}
		case 'i':
		{ 
			System.out.println("It is a vowel");
			break;
		}
		case 'o':
		{ 
			System.out.println("It is a vowel");
			break;
		}
		case 'u' :
		{ 
			System.out.println("It is a vowel");
		}
		default :
		{
			System.out.println("It is a consonant");
			break;
		}
		}
	}
}