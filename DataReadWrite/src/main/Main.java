package main;

import read.file.FileTextReader;
import read.keyboard.KeyboardReader;
import write.file.FileTextWriter;
//import read.file.FileTextReader;
//import read.keyboard.KeyboardReader;

public class Main {
	public static void main(String[] args) {
		KeyboardReader keyboardReader = new KeyboardReader();
		
		System.out.println("Please enter the filename you wana write to and read from");
		
		FileTextWriter fileTextWriter = new FileTextWriter(keyboardReader.readLine(), true);
		FileTextReader fileTextReader = new FileTextReader(fileTextWriter.file.getName());
		
		
		
		System.out.print(fileTextReader.fileRead());
		
		String stringToWrite  = "\nUn nou rand in plus";
		fileTextWriter.write(stringToWrite, true);
		
		System.out.print(fileTextReader.fileRead());
		
	}
	
	
}
