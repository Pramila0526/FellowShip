/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Check Whether the Given String is Palindrome or not.
 * 
 */

package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

  public class Palindrome 
  {
	  public static void main(String[] args)
	{
		
		System.out.println("Enter the Number");
		int num=Utility.IntegerInput();
        System.out.println(Utility.palindrome(num));
	}

 }
