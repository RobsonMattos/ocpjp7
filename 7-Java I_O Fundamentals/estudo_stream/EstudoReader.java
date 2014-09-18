package estudo_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EstudoReader {

	public static void main(String[] args) {
		// NIO, access components, test and compare, file operations, throws IOExceptions
		Path path = Paths.get("xanadu.txt"); 
		Path destino = Paths.get("/home/robson/Desenvolvimento");
		
		
		File input = new File("xanadu.txt");
		
		try {
			FileReader reader = new FileReader(input);
			BufferedReader buf = new BufferedReader(reader);
			String str = buf.readLine();
			System.out.println(str);
		} catch (Exception e) {
			System.err.println("Erro da porra");
		}
	}

}
