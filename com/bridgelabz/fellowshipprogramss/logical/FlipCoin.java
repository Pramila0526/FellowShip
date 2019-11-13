
package com.bridgelabz.fellowshipprogramss.logical;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
import java.util.*;
public class FlipCoin 
{   public static void main(String args[])
	    {
	        int heads = 0;
	        int tails = 0;
	        int counter = 1;
	        double randNum = 0.0;
	        Scanner in = new Scanner(System.in);
	         
	        System.out.println("How many times will the coin be flipped? ");
	        int flips = in.nextInt();
	         
	        while(counter <= flips)
	        {
	            randNum = Math.random();
	            System.out.print(counter + "\t" + randNum);
	             
	            if(randNum < .5)
	            {
	                heads++;
	                System.out.println("\t heads");
	            }
	            else
	            {
	                tails++;
	                System.out.println("\t tails");
	               }
	            counter++;      
	        }
	        System.out.println();
	        System.out.println("Number of Heads = " + heads);
	        System.out.println("Number of Tails = " + tails);
	         
	         
	         
	    }
	}

