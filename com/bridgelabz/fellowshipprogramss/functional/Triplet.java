package com.bridgelabz.fellowshipprogramss.functional;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Triplet 
{
   public static void main(String[] args)
	{
		System.out.println("enter the number of elements");
		int n=Utility.IntegerInput();
		int a[]=new int[n];
		System.out.println("Enter the Elements in an array");
		for(int i=0;i<n;i++)
		{
		a[i]=Utility.IntegerInput();
		}
		System.out.println("enter your target");
		int target=Utility.IntegerInput();
		System.out.println(Utility.Triplet(n,a,target));
		
	}

}
