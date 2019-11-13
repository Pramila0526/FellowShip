package com.bridgelabz.fellowshipprogramss.utility;
import java.util.*;

public class Utility 
{
	
	static Scanner sc=new Scanner(System.in);
	public static int IntegerInput()
	{
		return sc.nextInt();
	}
	public static double DoubleInput()
	{
		return sc.nextDouble();
	}
	public static String StringInput()
	{
		return sc.nextLine();
	}
	
	/*****Binary Search*****/
	
	public static int binarySearch(int n,int a[],int search)
	{
		int start=0;
		int end=n-1;
		int mid=(start+end)/2;
		
			while(start<=end)
			{
				mid=(start+end)/2;
				
				if(a[mid]<search)
				{
					start=mid+1;
				}
					else if(a[mid]==search)
					{
						System.out.println("Element found at " +(a[mid]-1));
						break;
					}
				else
				{
					end=mid-1;
				}
					if(start>end)
					{
						System.out.println("Not found");
					}
	}
			return mid;
		
}
	
	/*****Bubble Sort*****/
	
	public static int bubbleSort(int n,int a[])
	{
		int temp=0;
		int i,j;
		for( i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j+1]<a[j])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("sorted array is");
		for( j=0;j<n;j++)
		{
			System.out.println(a[j]);
		
		}
		return  0;
	}
	
	/*****Insertion Sort*****/
	
	public static int insertionSort(int n,int a[])
	{
		int i,j;
		int temp;
        for(i=1;i<n;i++)
			{
				temp=a[i];
				j=i;
				while(j>0 && a[j-1]>temp)
				{
				  a[j]=a[j-1];
				  j--;                  
				}
				a[j]=temp;       //temp is transfered to the next for comparing the 
				                 // temp value with the prev elements
			}
		System.out.println("Sorted array is");
			for( j=0;j<n;j++)
			{
				System.out.println(a[j]);
			
			}
		return 0;
		}
	
	/*****Anagram*****/
	
	public static String Anagram(String first,String second)
	{
		String s="";
		int i,j;
		int found=0;
		int not_found=0;
		int n1=first.length();
		int n2=second.length();
	  if(n1==n2)
			{
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++)
			{
				if(first.charAt(i)==second.charAt(j))
					{
					
					found=1;
					break;
					
					}
			}
			if(found==0)
				{
					not_found=1;
					break;
					
				}
		
		     }
				if(not_found==1)
				{
				System.out.println("Strings are not anagram");
				
			    }
				else
				{
					System.out.println("Strings are  anagram");
				}
		}
		
			else
			{
				System.out.println("Length should be equal");
			}
		return s;
	}
	
	/*****Prime In Range*****/
	
	public static String primeInRange(int limit)
	{
		String s="";
		

		 boolean isPrime;
		 int count=0;
		 int rem, temp, reversed;
		 
			 for (int number = 1; number <= limit; number++)
			 {
			 isPrime = true;
				 
				 for(int i = 2; i <=number-1 ; i++)
				 {
				 if((number % i) == 0)
				 isPrime = false;
				 }
					 if (isPrime)  
					 {
						 System.out.println(number);
						 count++;
					 }
	}
		System.out.println();
		System.out.println("Prime Count" +count);
		return s;

	}
	
	/*****Palindrome*****/
	
public static String  palindrome(int num)
	{
		String s="";
		int rev=0;
		int rem;
		
		
		int temp=num;
				while(num>0)
				{
					 rem=num%10;
					 rev=(rev*10)+rem;
					num=num/10;
					
				}
		if(temp==rev)
		
			System.out.println("It is a Palindrome");
		else
			System.out.println("Not Palindrome");
		

	return s;
	}
	
	/*****Prime Palindrome*****/
	
public static String primePalindrome(int limit)
	 {
	 String s="";
	
	 boolean Prime;
	 int count=0;
	 int rem, temp, reversed;
	 
		 for (int number = 1; number <= limit; number++)
		 {
		 Prime = true;
			 
			 for(int i = 2; i <=number-1 ; i++)
			 {
			 if((number % i) == 0)
			 Prime = false;
			 }
				/* if (Prime)  //We can put isPrime here too
				 {*/
				 temp = number;
				 reversed = 0;
						 while (temp != 0)
						 {
						 rem = temp % 10;
						 reversed = (reversed * 10) + rem;
						 temp /= 10;
						 }
							 if (reversed == number && Prime)
							 {
							 System.out.print(number + " ");
							 count++;
							 }
				 }
    
    System.out.println();
	System.out.println("Prime Palindrome Count " +count);
	return s;
	}

   /*****Prime Factor****/
public static int primeFactor(int number) 
{
	

for(int i=2;i<number;i++)
{
	while(number%i==0)
	{
		System.out.print(i+ " ");
		number=number/i;
	}
	
}
return number;
}	

	/*****Merge Sort*****/

public static String mergeSort()
	{
     String s="";
     
     return s;
	}

	/*****Array2D*****/
	
public static int[][] Array2D(int row,int column,int[][] arr) 
	{
       int i,j;
       for( i=0;i<row;i++)
		 {
			 for( j=0;j<column;j++)
			 {
				 arr[i][j]=Utility.IntegerInput();
			 }
		 }
		System.out.println("2D array");
		 {
			 for( i=0;i<row;i++)
			 {
				 for(j=0;j<column;j++)
				 {
					System.out.print(arr[i][j]+ "\t");
				 }
				System.out.println();
			 }

		 }
		return null;
	}  
	
	
	/*****Matrix Multiplication*****/
	
public static String MatrixMultiplication(int rows,int columns,int arr1[][],int arr2[][],int result[][])
{
	String s="";
	int i;
	
	
	System.out.println("Matrix after Multiplication");
	for(i=0;i<rows;i++)
	 {
	 for(int j=0;j<columns;j++)
	 {
		 for(int k=0;k<columns;k++)
		 {
			 result[i][j]=arr1[i][k]*arr2[k][j];
		 }
		
		 
		 System.out.print(result[i][j]+ "\t");
		
	 }
	 System.out.println();
	
}
	
return s;
	
}

  /*****Triplet*****/

	public static String Triplet(int n,int a[],int target)
 {
	String s="";
	
	for(int i=0;i<n-2;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[i]+a[j]+a[k]==target)
				{
				System.out.println("Target found at" +i+ " " +j+ " " +k);
				break;
				}
			  }
		    }
          }
	 System.out.println("Not found");	

	 return s;
	}

  /*****Distance*****/

public static String Distance(int x1,int x2,int y1,int y2)
{
	String s="";
	double a= Math.pow(y2-y1,2); //values of equation
	double b= Math.pow(x2-x1,2);  //values of equation
    double distance= Math.sqrt(a + b);
	System.out.println(distance);
	return s;
}

	/*****Quadratic*****/

public static String Quadratic(double a,double b,double c)
{
	String s="";
	
	
	double delta = b*b- 4*a*c;
	double	Root1ofx =  (-b + Math.sqrt(delta))/(2*a);
	double Root2ofx =  (-b - Math.sqrt(delta))/(2*a);
	System.out.println("Result is" +Root1ofx+ " " +Root2ofx );
	return s;
	}

   /*****WindChill*****/

public static String WindChill(double t,double v)
{
	String s=" ";
	
	double w=35.74+(0.6215*t)+(0.4275*t-35.75)*Math.pow(v,0.16);
	System.out.println("W " +w);
	return s;
}


   /*****Temperature Conversion*****/

public static String temperatureConversion()
{
	String s="";
	
	double Fahreneit=0;
	double Celcius=0;
	
	
	System.out.println("Enter 1 if you wnat to convert Fahrenit to Celcius");
	System.out.println("Enter 2 if you wnat to convert Celcius to Fahreneit");
	int c=sc.nextInt();
	if(c==1)
	{
		System.out.println("Enter Fahreneit");
		 Fahreneit=sc.nextInt();
		Fahreneit= (Celcius * 9/5) + 32;
		System.out.println(Fahreneit);
	}
	else if(c==2)
	{
		System.out.println("Enter Celcius");
		Celcius=sc.nextInt();
		Celcius= (Fahreneit - 32) * 5/9;
	    System.out.println(Celcius);
	}
	
	return s;
}

      /*****Monthly Payment*****/

public static String monthlyPayment(double Principle,int Years,double Rate)
{
	String s="";
	
	double n=12*Years;
	double r=Rate/(12*100);
	System.out.println("Payment");
	double Payment=  (Principle*r)/1-Math.pow(1+r,-n);
	System.out.println(Payment);
	return s;
}

       /*****Day Of Week*****/

public static String dayOfWeek(int Date,int Month,int Year)
{
	String s="";
	
	        int y0 = Year -(14 - Month) / 12;
			int x = y0 + y0/4 -y0/100 + y0/400;
			int m0 = Month + 12 * ((14 - Month) / 12) - 2;
			int d0 = (Date + x + 31*m0/ 12) %7;
	
           System.out.println(d0);
           String day;
           switch(d0)
           {
               case 0:
    		   day="Sunday";
    		   break;
        	   case 1:
        		   day="Monday";
        		   break;
        	   case 2:
        		 day=  "Tuesday";
        		   break;
        	   case 3:
        		   day=  "Wednesday";
        		   break;
        	   case 4:
        		   day=  "Thursday";
        		   break;
        	   case 5:
        		   day=   "Friday";
        		   break;
        	   case 6:
        		   day=    "Saturday";
        		   break;
        		default:
        			day="Invalid";
           }
           System.out.println(day);
	return s;
}


    /*****Vending Machine*****/

public static String vendingMachine(int Amount)
{
	String s="";
	int Notes[]= {2000,500,200,100,50,20,10,5,2,1,0};
	int Result[]=new int[10];
	for(int i=0;i<10;i++)
		
	{
		if(Amount>=Notes[i])
		{
			Result[i]=Amount/Notes[i];
			Amount=Amount%Notes[i];
		}
		else
		{
			Result[i]=0;
		}
	}
	System.out.println("Result is");
	for(int i=0;i<10;i++)
	{
		System.out.println( +Notes[i]+ ":" +Result[i]);

}
	
return s;
}
  
    /*****Decimal To Binary*****/

public static String decimalToBinary(int number)
{
	String s="";
	int Binary[]=new int[40];
	
	int index=0;
	
			while(number>0)
			{
				Binary[index++]=number%2;
			  //  binary=binary*10+remainder; 
				number=number/2;
			}
	
	for(int i=index-1;i>=0;i--)
	{
	System.out.print(Binary[i]);
	}
return s;
}

   /*****Replacing the String with the given Username*****/

public static String uInput(String UserName, int n) 
{
	String s="";
	
	 if(n<=3)
	 {
		 String Output="Hello "  +UserName+ ", How are you?";
		 System.out.println(Output);
	 }
	 else
	 {
		 System.out.println("length of Name should be less than 4 ");
	 }
	
	return s;
}
}
