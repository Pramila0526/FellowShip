/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Searching a number using Binary Search.
 * 
 */

package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		
		int i;
		System.out.println("Enter the number of Elements");
		int n=Utility.IntegerInput();
		int a[]=new int[n];
		System.out.println("Enter the Elements in an array");
		
		for( i=0;i<n;i++)
		{
			a[i]=Utility.IntegerInput();
		}
		
		System.out.println("Enter the Elements to be searched");
		
		int search=Utility.IntegerInput();
		System.out.println(Utility.binarySearch(n,a,search));

	}

}
