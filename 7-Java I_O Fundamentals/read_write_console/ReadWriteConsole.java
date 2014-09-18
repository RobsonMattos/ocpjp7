package read_write_console;

import java.io.Console;

// Item 1: Read and write data from the console.
public class ReadWriteConsole {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");
//		String nome = s.nextLine();
//		System.out.println(nome);
		
		// console();
	}
	
	static void console() {
		Console con  = System.console();
		String name = con.readLine("Digite o usuario: "); // ou pode ser char[] name
		System.out.println(name);
	}
	
}
