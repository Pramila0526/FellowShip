package inventory.utiltiy;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Utility {

	 static Scanner sc;

	public static int integerInput() {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static double doubleInput() {
		sc = new Scanner(System.in);
		return sc.nextDouble();
	}

	public static String stringInput() {
		sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static int longInput() {
		sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return (Date) sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}

	

	public static char charScanner()
	{
		sc = new Scanner(System.in);
		return sc.next().charAt(0);
	}

	/**
	 * Purpose: shuffles the card of deck
	 * 
	 * @param arr array of cards
	 * @return returns shuffle array
	 */
	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	/**
	 * Purpose: method for calculate total value of stock
	 * 
	 * @param numberOfShares input from program
	 * @param sharePrice     input from program
	 * @return returns the multiplication of numberOfShares sharePrice
	 */
	public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
		return numberOfShares * sharePrice;
	}

	/**
	 * Purpose: method for creating message using regex
	 * 
	 * @param fullname input from user
	 * @param mobile   input from user
	 * @return returns the message
	 */
	public static String message(String fullname, String mobile, String str) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(0);
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String strInput = str;
		String str1 = strInput.replaceAll("<<name>>", firstName);
		String str2 = str1.replaceAll("<<fullname>>", fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("Date", dateFormat.format(date));

		return str4;

	}
	
	


}