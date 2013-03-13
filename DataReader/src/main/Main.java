package main;
import read.file.FileTextReader;
import read.keyboard.KeyboardReader;
import write.file.FileTextWriter;

public class Main {
	public static void main(String[] args) {
		KeyboardReader keyboardReader = new KeyboardReader();
		
		
		System.out.println("Please enter the filename you wana write to and read from");
		
		String stringToWrite  = "\n Un nou rand in plus";
		FileTextWriter fileTextWriter = new FileTextWriter(keyboardReader.readLine(), true);
		fileTextWriter.write(stringToWrite, true);
		
		FileTextReader fileTextReader = new FileTextReader(fileTextWriter.file.getName());
		System.out.println(fileTextReader.fileRead());
		
		
		
		
	}
	
	
}
