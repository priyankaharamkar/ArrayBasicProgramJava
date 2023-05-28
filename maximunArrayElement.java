package org.tech;
import java.util.*;
public class maximunArrayElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max;
	int a[]=new int[5];
	System.out.println("Enter the value of Array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Maximum Vaue in Array is = "+max);

	}

}
