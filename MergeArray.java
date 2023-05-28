package org.tech;
import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int [a.length+b.length];
	System.out.println("Enter the value of first Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
    System.out.println("Enter the value of second Array");
    for(int i=0;i<b.length;i++)
    {
    	b[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
    	c[i]=a[i];
    }
    for(int i=0;i<b.length;i++)
    {
    	c[i+a.length]=b[i];
    }
    for(int i=0;i<c.length;i++)
    {
    	System.out.println(c[i]);
    }
    
	}

}
