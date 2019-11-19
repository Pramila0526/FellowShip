package com.bridgelabz.fellowshipprogramss.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW2 
{
	public static void main(String[] args) throws Exception {
	String directory = System.getProperty("home/admin94/Desktop/Text");
	String fileName = "Text";
	String absolutePath = directory + File.separator + fileName;

	// write the content in file 
	try(FileWriter fileWriter = new FileWriter(absolutePath)) {
	    String fileContent = "This is a sample text.";
	    fileWriter.write(fileContent);
	} catch (IOException e) {
	    // exception handling
	}

	// read the content from file
	try(FileReader fileReader = new FileReader(absolutePath)) {
	    int ch = fileReader.read();
	    while(ch != -1) {
	        System.out.print((char)ch);
	        ch = fileReader.read();
	    }
	} catch (FileNotFoundException e) {
	    // exception handling
	} catch (IOException e) {
	    // exception handling
	}
}}
