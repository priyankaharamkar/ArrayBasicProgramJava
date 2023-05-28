package org.tech;
import java.util.*;
public class Occeurenceofele {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}	
		int count=1;
		int i;
		int visited=-1;
		for(i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					++count;
					a[j]=visited;
				}
			}
		}
		if(a[i]!=visited)
		{
			System.out.printf("%d--->%d\n",i,count);
		}
		

	}

}
