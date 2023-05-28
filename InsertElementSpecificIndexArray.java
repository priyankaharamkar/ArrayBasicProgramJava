package org.tech;
import java.util.*;
public class InsertElementSpecificIndexArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len,index,value;
	System.out.println("Enter the length of array");
	len=sc.nextInt();
	int a[]=new int[len];
	System.out.println("Enter the value of Array");
	for(int i=0;i<len;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index");
	index=sc.nextInt();
	System.out.println("Enter the value");
	value=sc.nextInt();
	for(int i=len-2;i>=index;i--)
	{
		a[i+1]=a[i];
	}
	a[index]=value;
	System.out.println("After insert value of Array is :");
	for(int i=0;i<len;i++)
	{
		System.out.printf("a[%d]---->%d\n",i,a[i]);
	}
	}

}
