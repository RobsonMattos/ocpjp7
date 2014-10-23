package read_write_console;

import java.io.Console;

// não funciona no eclipse
public class ReadWriteConsole {

	public static void main(String[] args) {
		String name = "";
		Console c  = System.console();
		char[] pw;
		pw = c.readPassword("%s", "pw: ");
		
		for (char ch : pw)
			c.format("%c ", ch);
		
		c.format("\n");
		
//		System.out.println(name);
	}
	
}
