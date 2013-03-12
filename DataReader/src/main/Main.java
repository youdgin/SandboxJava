package main;

import file.FileTextReader;
import keyboard.KeyboardReader;

public class Main {

	public static void main(String[] args) {
		KeyboardReader keyboardReader = new KeyboardReader();
		
		System.out.println("Please enter the filename you wana read from");
		
		FileTextReader fileTextReader = new FileTextReader(keyboardReader.readLine());
		System.out.println(fileTextReader.fileRead());
	}
	
	
}
