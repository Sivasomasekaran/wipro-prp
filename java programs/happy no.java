/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int sum(int a)
	{
		int sum;
		sum=0;
		while(a>0)
		{
			int r=a%10;
			sum=sum+r*r;
			a=a/10;
			
		}
	return sum;
		
	}
	
	static boolean ishap(int n)
	{
		int s,f;
		s=f=n;
		do{
			s=sum(s);
			f=sum(sum(f));
			
			
		}
		while(s!=f);
		return(s==1);
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		int no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		if(ishap(no))
		System.out.println("happy number");
		else
		System.out.println("not happy number");
		
		
	}
}
