package com.bridgelabz.fellowshipprogramss.junit;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) 
	
	{
	
	
	System.out.println("Enter the number to convert it into binary");
	int number=Utility.IntegerInput();
	System.out.println(Utility.decimalToBinary(number));
	}
}
