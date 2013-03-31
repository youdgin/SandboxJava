package main;

import read.file.FileTextReader;
import read.keyboard.KeyboardReader;
import write.file.FileTextWriter;

public class Main {
	public static void main(String[] args) {
		
		KeyboardReader keyboardReader = new KeyboardReader();
		
		
		FileTextWriter fileTextWriter = new FileTextWriter(keyboardReader.readLine("Enter the filename you wana write to and read from"));
		FileTextReader fileTextReader = new FileTextReader(fileTextWriter.file.getName());
		
		System.out.print(fileTextReader.fileRead());
		
		String stringToWrite  = keyboardReader.readLine("\nEnter the text you wanna write to end of the file");
		fileTextWriter.write(stringToWrite);
		
		System.out.print("The new contents of the file are:\n" + String.valueOf(fileTextReader.fileRead()));
		
	}
	
	
}
