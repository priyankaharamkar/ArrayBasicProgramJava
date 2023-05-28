package org.tech;
import java.util.*;
public class minimumElementArray {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int min;
    int a[]=new int[5];
    System.out.println("Enter the value of Array");
    for(int i=0;i<a.length;i++)
    {
    	a[i]=sc.nextInt();
    }
    min=0;
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]<min)
    	{
    		min=a[i];
    	}
    }
    System.out.println("Minimum Value in Array is ="+min);
	}

}
