/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Calculate Eucledian Distance.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		System.out.println("enter the value of x1 and y1");	
		int x1=Utility.IntegerInput();
		int y1=Utility.IntegerInput();
		System.out.println("enter the value of x2 and y2");	
		int x2=Utility.IntegerInput();
		int y2=Utility.IntegerInput();
		
		System.out.println(Utility.distance(x1,y1,x2,y2));
		
	}

}
