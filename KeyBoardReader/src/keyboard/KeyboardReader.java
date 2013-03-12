package keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {

	public KeyboardReader() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
