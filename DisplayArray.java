package org.tech;
import java.util.*;
public class DisplayArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int a[]=new int[5];
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Display the value of Array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	
	}
	}

}
