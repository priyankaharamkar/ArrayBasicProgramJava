package org.tech;
import java.util.*;
public class midArrayElement {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int len;
    int n=0;
    System.out.println("Enter the length fo Array");
    len=sc.nextInt();
    int a[]=new int[len];
   System.out.println("Enter the value of Array");
   for(int i=0;i<len;i++)
   {
	   a[i]=sc.nextInt();
   }
   System.out.println("Display the array");
   for(int i=0;i<len;i++)
   {
	   System.out.println(a[i]);
   }
   System.out.println("mid of Array is :");
   for(int i=0;i<len;i++)
   {
	   n=(len+1)/2;
   }
   System.out.println(n);
    

	}

}
