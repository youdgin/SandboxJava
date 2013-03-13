package write.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTextWriter {
	private FileWriter fileWriter;
	public File file;
	
	public FileTextWriter(String pathname) {
		this.commonConstructor(pathname, false);
	}
	
	public FileTextWriter(String pathname, boolean append){
		this.commonConstructor(pathname, append);
	}
	
	private void commonConstructor(String pathname, boolean append){
		file = new File(pathname);
		try {
			fileWriter = new FileWriter(file, append);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(String string){
		this.write(string, false);
	}
	
	public void write (String string, boolean close){
		try {
			fileWriter.write(string);
			fileWriter.flush();
			if(close)
				fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
