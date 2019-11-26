package com.bridgelabz.fellowshipprogramss.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class Hashing 
{
	
public static void main(String[] args) throws Exception 
	{
		
		System.out.println("Enter the size");
		int size =Utility.IntegerInput();
		HashChaining linkedHash = new HashChaining(size);
		File file = new File("/home/admin94/Desktop/Text");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String readFileStore = "Text";
		String readFile;
		while ((readFile = bufferedReader.readLine()) != null) 
		{
			readFileStore = readFileStore + readFile +" ";
		}
		bufferedReader.close();
		for (String fileString : readFileStore.split("\\s", 0)) 
		{
			int number =Utility.IntegerInput();//Integer.parseInt(fileString);
			linkedHash.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = Utility.IntegerInput();
		linkedHash.search(value);
		linkedHash.display();
		linkedHash.write();
		linkedHash.display();
	}
}