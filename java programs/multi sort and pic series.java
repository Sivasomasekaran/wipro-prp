/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int i,j,n,st;
		st=0;
		String[] name=new String[l];
		int[] s=new int[l];
		for(i=0;i<l;i++)
		{
			name[i]=sc.next();
		}
		
		for(i=0;i<l;i++)
		{
			s[i]=sc.nextInt();
		}
		for(i=0;i<l;i++)
		{
			for(j=i;j<l;j++)
			{
				if(s[i]>s[j])
				{
					int t1;
					String t2;
					t1=s[i];
					t2=name[i];
					s[i]=s[j];
					name[i]=name[j];
					s[j]=t1;
					name[j]=t2;
					
				}
				
			}
		}
		for(i=0;i<l;i++)
		{
			int tmp=s[i]+1;
			n=0;
			for(j=i;j<l||j<i+4;j++)
			{
				if(s[j]==tmp)
				{
					tmp++;
					n++;
					
				}
				else
				break;
			}
			if(n==3)
			{
			st=i;
			break;
			}
		}
		for(i=st;i<st+4;i++)
		{
			System.out.println("  "+name[i]+" ");
		}
		
		
		
	}
}
