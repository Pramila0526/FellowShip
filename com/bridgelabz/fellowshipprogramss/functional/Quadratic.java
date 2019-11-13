package com.bridgelabz.fellowshipprogramss.functional;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a b and c");
		double a=Utility.DoubleInput();
		double b=Utility.DoubleInput();
		double c=Utility.DoubleInput();
		System.out.println(Utility.Quadratic(a,b,c));

	}

}
