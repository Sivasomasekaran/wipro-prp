/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int n,i,j,c=0;
	 Scanner sc =new Scanner(System.in);
	 n=sc.nextInt();
	 String s=" ";
	 int n1[];
	 int a[]=new int[n];
	 for(i=0;i<n;i++)
	 {
	 	a[i]=sc.nextInt();
	 	
	 }
	 for(i=0;i<n;i++)
	 {
	 	String tmp=Integer.toString(a[i]);
	 	c=c+tmp.length()-1;
	 	s=s+tmp+" ";
	 }
	 String[] s2=s.split(" ");
	 n1=new int[c];
	 int k=0;
	 for(i=0;i<s2.length;i++)
	 {
	 	for(j=0;j<s2[i].length()-1;j++)
	 	{
	 		String s1="";
	 		s1=s2[i].charAt(j)+s1+s2[i].charAt(j+1);
	 		n1[k]=Integer.parseInt(s1);
	 		k++;
	 	}
	 
	 }
	 for(i=0;i<c;i++)
	 {
	 	for(j=i;j<c;j++)
	 	{
	 		if(n1[i]>n1[j])
	 		{
	 		int tmp=n1[i];
	 		n1[i]=n1[j];
	 		n1[j]=tmp;
	 		}
	 	}
	 }
	 System.out.print(n1[0]+""+n1[c-1]);
	 
	}
}
