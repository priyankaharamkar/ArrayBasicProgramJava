package org.tech;
import java.util.*;
public class AnagramArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the first Array length");
	len=sc.nextInt();
    //System.out.println("Enter the second Array length");
    //len2=sc.nextInt();
	boolean flag=false;
	int a[]=new int[len];
	int b[]=new int[len];
	System.out.println("Enter the first array values");
	for(int i=0;i<len;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the second array values");
	for(int i=0;i<len;i++)
	{
		b[i]=sc.nextInt();
	}
   // System.out.println("Sort both array");
    for(int i=0;i<len;i++)
    {
    	for(int j=i+1;j<len;j++)
    	{
    		if(a[i]>a[j])
    		{
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    		if(b[i]>b[j])
    		{
    			int temp=b[i];
    			b[i]=b[j];
    			b[j]=temp;
    	}
    }
   }
    for(int i=0;i<len;i++)
    {
    	if(a[i]==b[i])
    	{
    		flag=true;
    		break;
    	}
    }
    if(flag)
    {
    	System.out.println("Anagram");
    }
    else {
    	System.out.println("Not Anagram");
    }

	}

}
