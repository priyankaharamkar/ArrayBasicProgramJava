package org.tech;
import java.util.*;
public class EvenNegativeElementArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length of array");
	len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the value of Array");
	for(int i=0;i<len;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Negative Even Element is Array");
	for(int i=0;i<len;i++)
	{
		if(a[i]<0 && a[i]%-2==0)
		{
			System.out.println(a[i]);
		}
	}

	}

}
