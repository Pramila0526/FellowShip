/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Prime Factor.
 * 
 */

package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class PrimeFactor 
{
public static void main(String args[])
{
	System.out.println("Enter the number");
	int number=Utility.IntegerInput();
	System.out.println(Utility.primeFactor(number));
}
}
