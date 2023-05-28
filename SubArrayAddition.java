package org.tech;

import java.util.*;
public class SubArrayAddition
{
 public static void main(String x[])
 {
   int i,j,N,S;
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("enter the value of N ");
   N=sc.nextInt();
   System.out.println("enter the value of S ");
   S=sc.nextInt();
   System.out.println("enter the value of array");
   for(i=0;i<a.length;i++)
	{
	  a[i]=sc.nextInt();
	}
   for(i=0;i<a.length-1;i++)
   {
    for(j=1;j<a.length;j++)
     {
       if(N==a[i]+a[j])
		{
			System.out.printf("a[%d]-->%d\n",i,a[i]);
		}
       if(S==a[i]+a[j])
		{
			System.out.printf("a[%d]--->%d\n",i,a[i]);
		}
     }
   }
 }
}