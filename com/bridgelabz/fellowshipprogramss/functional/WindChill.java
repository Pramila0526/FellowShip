package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class WindChill 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of t and v");
		double t=Utility.DoubleInput();
		double v=Utility.DoubleInput();
		System.out.println(Utility.WindChill(t,v));

	}

}
