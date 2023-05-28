package org.tech;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length of Array");
	len=sc.nextInt();
	int a[]=new int[len];
	int mid,end,start,temp;
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	//reverse logic
	mid=len/2;
	end=len-1;
	for(start=0;start<mid;start++)
	{
		temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		end--;
	}
	System.out.println("Reverse Array is :");
	for(int i=0;i<len;i++)
	{
		System.out.printf("a[%d]---->%d\n",i,a[i]);
	}

	}

}
