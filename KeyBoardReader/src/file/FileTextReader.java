package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader {
	File file;
	FileReader fileReader;
	char[] cbuf;
	public FileTextReader(String pathname) {
		file = new File(pathname);
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Warning! not too big file here to not flip the int limits, need to rethink this
		cbuf = new char[(int)file.length()];
	}
	
	public char[] fileRead(){
		try {
			fileReader.read(cbuf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cbuf;
	}


}
