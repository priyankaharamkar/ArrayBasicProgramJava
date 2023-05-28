package org.tech;
import java.util.*;
public class FibonanciiArrayElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length");
	len=sc.nextInt();
	int a[]=new int [len];
	a[0]=0;
	a[1]=1;
	System.out.println("Fibonancii of Array is :");
	System.out.println(a[0]);
	System.out.println(a[1]);
	for(int i=2;i<len;i++)
	{
		a[i]=a[0]+a[1];
		a[0]=a[1];
		a[1]=a[i];
	}
	
	for(int i=2;i<len;i++)
	{
		System.out.println(a[i]);
	}
	}

}
