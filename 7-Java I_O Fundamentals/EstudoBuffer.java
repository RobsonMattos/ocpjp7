import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EstudoBuffer {
	String texto = "Escrevendo algo para estudar.";
	
	public static void main(String[] args) {
		EstudoBuffer eb = new EstudoBuffer();
		try {
			File file = new File("EstudoFile.txt");
			eb.escrever(file);
			eb.ler(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void escrever(File file) throws IOException {
		PrintWriter pw = new PrintWriter(file);
		BufferedWriter bw = new BufferedWriter(pw);
		bw.write("EstudoBuffer");
		bw.newLine();
		bw.write(texto);
		bw.flush();
		bw.close();
	}
	
	private void ler(File file) throws IOException {
		FileReader in = new FileReader(file);
		BufferedReader br = new BufferedReader(in);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
	}
}