package keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {
	private BufferedReader bufferedReader;
	
	public KeyboardReader() {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public String readLine(){
		try {
			return bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
