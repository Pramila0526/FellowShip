package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;


public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("Enter first String");
		String first=Utility.StringInput();
		
		System.out.println("Enter second String");
		String second=Utility.StringInput();
		
		System.out.println(Utility.Anagram(first,second));

	}

}
