package read_write;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EstudoReadWrite {
	private char[] in = new char[200];
	private int tamanho;
	
	public static void main(String[] args) {
		EstudoReadWrite erw = new EstudoReadWrite();
		File file = new File("EstudoFile.txt");
		try {
			erw.escrever(file);
			erw.ler(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void escrever(File file) throws IOException {
		FileWriter fw = new FileWriter(file);
		fw.write("Escrevendo alguma coisa no arquivo.");
		fw.flush();
		fw.close();
	}
	
	private void ler(File file) throws IOException {
		FileReader fr = new FileReader(file);
		tamanho = fr.read(in);
		System.out.println(tamanho);
		for (char c : in)
			System.out.print(c);
	}
}
