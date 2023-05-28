package org.tech;
import java.util.*;
public class finddublicateele {

	public static void main(String[] args) {
		int a[]=new int[5];
		int count=0,j;
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
        for(int i=0;i<(5);i++)
        {
        	for(j=(i+1);j<a.length;j++)
        	{
        		if(a[i]==a[j])
        		{
        			count++;
        		}
        	}
        
        if(count>1)
        {
        	System.out.println(a[j]);
        }
	}
	}

}
