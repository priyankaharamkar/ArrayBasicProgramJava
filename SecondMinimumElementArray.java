package org.tech;
import java.util.*;
public class SecondMinimumElementArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int smin=0;
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Second Minimum Element in Array is =");
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(i==1)
		{
			smin=a[1];
		}
	}
	System.out.println(+smin);

	}

}
