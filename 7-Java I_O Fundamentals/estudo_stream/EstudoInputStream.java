package estudo_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EstudoInputStream {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			int i = br.read();
			System.out.println("ASCII value of " + (char)i + "is " + i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
