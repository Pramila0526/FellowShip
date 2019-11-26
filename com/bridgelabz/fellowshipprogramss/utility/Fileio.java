package com.bridgelabz.fellowshipprogramss.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.fellowshipprogramss.datastructure.OrderedList;


public class Fileio 
{
	
	public static void main(String[] args) throws Exception {
		
		OrderedList ol=new OrderedList();
		File file = new File("/home/admin94/Desktop/Text");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String readFileStore = "";
		String readFile;
		while ((readFile = bufferedReader.readLine()) != null) 
		{
			readFileStore = readFileStore + readFile +" ";
		}
		bufferedReader.close();
		for (String fileString : readFileStore.split("\\s", 0)) 
		{
			int number = Integer.parseInt(fileString);
			ol.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = Utility.IntegerInput();
		ol.search(value);
		ol.display();
		
	}
}