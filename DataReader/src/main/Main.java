package main;
import java.io.*;
import file.FileTextReader;
import keyboard.KeyboardReader;
import sun.nio.cs.StreamEncoder;

@SuppressWarnings("restriction")
public class Main {
	public static void main(String[] args) {
//		KeyboardReader keyboardReader = new KeyboardReader();
//		
//		System.out.println("Please enter the filename you wana read from");
//		
//		FileTextReader fileTextReader = new FileTextReader(keyboardReader.readLine());
//		System.out.println(fileTextReader.fileRead());
//		fileTextReader.close();
		FileWriter fileWriter = null;
		String stringToWrite = "Quisque id tortor et justo sagittis eleifend. \n";
		
		FileOutputStream fileOutputStream = null;
		try {
//			fileOutputStream = new FileOutputStream("Text.txt");
//			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//			outputStreamWriter.write(stringToWrite,0 , stringToWrite.length());
//			
			fileWriter = new FileWriter("Text.txt", true);
			fileWriter.append(stringToWrite);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
//		System.out.println();
//		System.out.println(fileTextReader.fileRead());
	}
	
	
}
