package com.bridgelabz.fellowshipprogramss.basiccore;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Uinput 
{
   public static void main(String[] args) 
	{
	     System.out.println("Enter the username");
		 String UserName=Utility.StringInput();
		 int n=UserName.length();
		 System.out.println(Utility.uInput(UserName,n));

    }
}