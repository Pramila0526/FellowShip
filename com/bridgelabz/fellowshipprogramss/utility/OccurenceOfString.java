package com.bridgelabz.fellowshipprogramss.utility;

public class OccurenceOfString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	String s="fellowshipprograms";
	char c[]=s.toCharArray();
	int n=c.length;
	int count=0;
	int p=0;
	for(int i=0;i<n;i++)
	{
		for( int j=1;j<n;j++)
		{
			if(s.charAt(i)==s.charAt(j)) 
			{
				count++;			
				
			}
			System.out.println("Occurence of " +c[i]+ " is " +count);
			break;
			
		   } 
	     }
	  }
	}
