package main;

import read.file.FileTextReader;
import read.keyboard.KeyboardReader;
import write.file.FileTextWriter;

public class Main {
	public static void main(String[] args) {
		
		KeyboardReader keyboardReader = new KeyboardReader();
		
		FileTextWriter fileTextWriter = new FileTextWriter(enterFilename(keyboardReader));
		FileTextReader fileTextReader = new FileTextReader(fileTextWriter.file().getName());
		
		read(fileTextReader);
		
		String switchString = "";
		String pathname = null;
		while (!switchString.equals("q")){
			System.out.println("\n\nOptions");
			System.out.println("q for exit");
			System.out.println("w for writing to file: '" + fileTextWriter.file().getName() + "'");
			System.out.println("a for writing to a different file");
			
			switchString = keyboardReader.readLine("\nEnter the desired option:");
			
			switch (switchString) {
			case "q":
				break;
				
			case "w":
				writeAndread(fileTextReader, fileTextWriter, keyboardReader);
				break;
				
			case "a":
				pathname = enterFilename(keyboardReader);
				fileTextWriter.setpathname(pathname);
				fileTextReader.setpathname(pathname);
				
				writeAndread(fileTextReader, fileTextWriter, keyboardReader);
				break;
				
			default:
				System.out.println("Invalid option");
				break;
			}
			
		}
		
	}
	
	public static void writeAndread(FileTextReader fileTextReader, FileTextWriter fileTextWriter, KeyboardReader keyboardReader){
		String stringToWrite = keyboardReader.readLine("\nEnter the text you wanna write to end of the file");
		fileTextWriter.write(stringToWrite);
		read(fileTextReader);
	}
	
	public static void read(FileTextReader fileTextReader){
		System.out.print("The contents of the file are:\n" + String.valueOf(fileTextReader.fileRead()));
	}
	
	public static String enterFilename(KeyboardReader keyboardReader){
		return keyboardReader.readLine("Enter the filename you wana write to and read from");
	}
}
