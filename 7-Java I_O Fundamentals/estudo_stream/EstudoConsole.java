package estudo_stream;

import java.io.Console;

public class EstudoConsole {

	public static void main(String[] args) {
		Console console = System.console();
		console.writer().print("Estudando...");

	}

}
