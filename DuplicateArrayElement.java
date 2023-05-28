package org.tech;
import java.util.*;
public class DuplicateArrayElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[8];
	System.out.println("Enter the value of array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
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
    //int count=1;
	System.out.println("Duplicate Element in Array");
	for(int i=0;i<a.length;i++) //6<5 false
	{     int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
			else {
				break;
			}
		}
		if(count>1)
		{
			System.out.printf(a[i]+"==="+count+"\n");
		}
		
		i=i+count-1;
		
		//i=i+count-1;//i=0+1-1;i=0;  i=1+1-1; i=1
		
	}
	}

}
