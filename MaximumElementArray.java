package org.tech;
import java.util.*;
public class MaximumElementArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int max;
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		max=a[i];
	}
	System.out.println("Maximum Element in Array is ="+max);

	}

}
