package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.AccessController;

import sun.security.action.GetPropertyAction;
import write.file.FileTextWriter;
//import read.file.FileTextReader;
//import read.keyboard.KeyboardReader;

public class Main {
	public static void main(String[] args) {
//		KeyboardReader keyboardReader = new KeyboardReader();
//		
//		System.out.println("Please enter the filename you wana write to and read from");
//		
//		FileTextWriter fileTextWriter = new FileTextWriter(keyboardReader.readLine(), true);
//		FileTextReader fileTextReader = new FileTextReader(fileTextWriter.file.getName());
//		
//		
//		
//		System.out.print(fileTextReader.fileRead());
//		
//		String stringToWrite  = "\n Un nou rand in plus";
//		fileTextWriter.write(stringToWrite, true);
//		
//		System.out.print(fileTextReader.fileRead());
//		System.out.print(fileTextReader.fileRead());
		File textFile = new File("Text.txt");
//		FileTextWriter fileTextWriter = new FileTextWriter(textFile.getName(), false);
		FileInputStream fileInputStream;
		InputStreamReader inputStreamReader;
		
		byte[] bytes = new byte[(int)textFile.length()];
		
		char[] chars = new char[(int)textFile.length()];
		try {
			 fileInputStream = new FileInputStream(textFile);
			 fileInputStream.read(bytes, 0, bytes.length);
			 bytes = new byte[(int)textFile.length()]; 
			 fileInputStream.read(bytes, 0, bytes.length);
			 
//			 inputStreamReader = new InputStreamReader(fileInputStream);
//			 inputStreamReader.read(chars, 0, chars.length);
//			 inputStreamReader.read(chars, 0, chars.length);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bytes[0]);
	}
	
	
}
