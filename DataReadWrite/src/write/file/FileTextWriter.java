package write.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Youdign
 *
 */
public class FileTextWriter {
	private File file;
	
	
	public FileTextWriter(String pathname){
		file = new File(pathname);
	}
	
	/**
	 * Appends string to the end of the text file.
	 * @param string
	 */
	public void write(String string){
		this.write(string, true);
	}
	
	public void write (String string, boolean append){
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(file, append);
			fileWriter.write(string);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public File file(){
		return this.file;
	}
	
	public void setpathname(String pathname){
		this.file = new File(pathname);
	}

}
