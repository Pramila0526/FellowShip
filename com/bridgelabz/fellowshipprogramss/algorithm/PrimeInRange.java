/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Prime numbers in the given Range.
 * 
 */

package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class PrimeInRange 
{

	public static void main(String[] args)
	{
		 System.out.println("Enter the Limit");
		 int limit=Utility.IntegerInput();
		 System.out.println("Enter prime numbers from 0 to"+limit);
		System.out.println(Utility.primeInRange(limit));
	}

}
