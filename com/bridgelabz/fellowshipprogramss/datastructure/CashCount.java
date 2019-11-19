package com.bridgelabz.fellowshipprogramss.datastructure;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class CashCount
{
public static void main(String args[])
{
Utility u=new Utility();
BankingSimulation q=new BankingSimulation();
int ch = 0;

do
{
	
  System.out.println();
  System.out.println("*****Banking Cash Counter*****");
  System.out.println("1.Deposit ");
  System.out.println("2.Withdraw ");
  System.out.println("3.Number of people in the Queue ");
  System.out.println("4.Exit ");
  System.out.println();
  System.out.println("Enter your choice: ");
  int choice=Utility.IntegerInput();
  
  switch (choice)
  {
		  case 1:
		  System.out.println("Enter the amount you want to Deposit");
		  q.insert(Utility.IntegerInput());
		  q.display();
		  break;
  
		  case 2:
		  System.out.println("Enter the amount you want to Withdraw ");
		  int amount=Utility.IntegerInput();
		  q.remove();
		  System.out.println(" Your Available Balance is: ");
		  q.display();
		  break;
  
		  	case 3:
		    int j=q.getSize();
			System.out.println("The Number of People in Queue is: "+j);
			break;
	
		  case 4:
		  System.exit(0);
		  default:
		  System.out.println("You entered wrong choice");
		  break;
  }
 
  }while(ch<=5);

}
}


