package org.tech;
import java.util.*;
public class ArraySortDescending {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	 System.out.println("Display After soring Array in Descending Order");
    for(int i=0;i<a.length;i++)
    {
    	for(int j=i+1;j<a.length;j++)
    		
    	{
    		if(a[i]<a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
	}
    for(int i=0;i<a.length;i++)
    {
    System.out.printf("a[%d]----->%d\n",i,a[i]);
    }
 }

}
