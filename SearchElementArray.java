package org.tech;
import java.util.*;
public class SearchElementArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length of array");
	len=sc.nextInt();
	boolean flag=false;
	int a[]=new int[len];
	System.out.println("Enter the value of Array");
	for(int i=0;i<len;i++)
	{
		a[i]=sc.nextInt();
	}
	int svalue;
	System.out.println("Enter the search Value in Array");
	svalue=sc.nextInt();

	for(int i=0;i<len;i++)
	{
		if(svalue==a[i])
		{
		  flag=true;
		  break;
		}
	}
	if(flag)
	{
		System.out.println("found");
	}
	else {
		System.out.println("Not Found");
	}

}
}
