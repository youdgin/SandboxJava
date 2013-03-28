package read.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader {
	public File file;
	private FileReader fileReader;
	public char[] cbuf;
	public FileTextReader(String pathname) {
		file = new File(pathname);
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Warning! not too big file here to not flip the int limits, need to rethink this
	}
	
	public char[] fileRead(){
		return this.fileRead(false);
	}
	
	public char[] fileRead(boolean close){
		cbuf = new char[(int)file.length()];
		try {
			fileReader.read(cbuf, 0, cbuf.length);
			if(close)
				fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cbuf;
	}
	


}
