/**
 *  @author: Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Vending Machine Program.
 * 
 */

package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class VendingMachine 
{
   public static void main(String[] args) 
	{
		
		System.out.println("Enter the amount");
		int Amount=Utility.IntegerInput();
		System.out.println(Utility.vendingMachine(Amount));
	}
}