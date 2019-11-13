package com.bridgelabz.fellowshipprogramss.junit;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter Principle");
		double Principle=Utility.DoubleInput();
		System.out.println("Enter Years");
		int Years=Utility.IntegerInput();
		System.out.println("Enter Rate");
		double Rate=Utility.DoubleInput();
	System.out.println(Utility.monthlyPayment(Principle,Years,Rate));

	}

}
