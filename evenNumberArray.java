package org.tech;
import java.util.*;
public class evenNumberArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length of Array");
	len=sc.nextInt();
	int a[]=new int [len];
	System.out.println("Enter the value of Array");
	for(int i=0;i<len;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Even Element in Array is :");
	for(int i=0;i<len;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}

	}

}
