package com.bridgelabz.fellowshipprogramss.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

import com.bridgelabz.fellowshipprogramss.datastructure.UnOrderedList;
import com.bridgelabz.fellowshipprogramss.utility.Utility;


 public class FileRW
	{
	 public static void main(String args[])throws Exception
	 {
    File file = new File("/home/admin94/Desktop/Text");
	 
	 BufferedReader filereader = new BufferedReader(new FileReader(file));
	 int count=0;
	 String fileWords[];
	 String lineOffileWords;
	 UnOrderedList dataStructure= new UnOrderedList();
	 
	 while((lineOffileWords =filereader.readLine()) != null )
	 {
	 
	 lineOffileWords+=filereader.readLine(); 
	 System.out.println(lineOffileWords);
	
	 fileWords=lineOffileWords.split(" ");
	 
	 for(int i=0;i<fileWords.length;i++)
	 {
	 dataStructure.insert(fileWords[i]);
	 }
	 
	 System.out.println("data in list---->");
	 dataStructure.display();
	 System.out.println("Enter search word");
	 String word = Utility.stringInput();
     dataStructure.search(word);
	 System.out.println("list after search word---->");
	 dataStructure.display();
	 FileWriter fe=new FileWriter(file);
	 String x="am";
	 fe.write(dataStructure.search(x));
	 System.out.println("list after search word---->");
	 dataStructure.display();
	  }
	}
}
