package org.tech;
import java.util.*;
   

public class OccurenceElementArray {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		 int size;
		 System.out.println("enter the size:");
		 size=xyz.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array:");
		 for(int i=0;i<size;i++)
		 {
			 a[i]=xyz.nextInt();
		 }
		 //sort in ascending order
		 for(int i=0;i<size;i++)
		 {
			 for(int j=i+1;j<size;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 //occurence
		 for(int i=0;i<size;i++)
		 {    int count=1;
			 for(int j=i+1;j<size;j++)
			 {
				 if(a[i]==a[j])
				 {
					 count++;
				 }
				 else
				 {
					 break;
				 }
			 }
			 i=i+count-1;
			 System.out.println(a[i]+"\t"+count);
		 }
		 
		 
		 
     
}
}