package read.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTextReader {
	public File file;
	public char[] cbuf;
	public FileTextReader(String pathname) {
		file = new File(pathname);
	}
	
	public char[] fileRead(){
		return this.fileRead(false);
	}
	
	public char[] fileRead(boolean append){
//		Warning! not too big file here to not flip the int limits, need to rethink this
		cbuf = new char[(int)file.length()];
		char[] localCbuf = new char[(int)file.length()];
		FileReader fileReader;
		try {
			fileReader = new FileReader(file.getName());
			fileReader.read(localCbuf, 0, cbuf.length);
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		With this clone we break the reference of array cbuf into the new FileReader object thus 
//		making fileReader eligible for garbage collection.
		cbuf = localCbuf.clone();
		return cbuf;
	}
	public void setpathname(String pathname){
		this.file = new File(pathname);
	}


}
