package nio2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Path (Paths.get, normalize)
// Files (exist, delete, copy, createDirectory, isSameFile)
public class EstudoNIO2 {

	public static void main (String[] args) {
		
		Path pasta = Paths.get("/home/robson/Desenvolvimento/EstudoNIO2");
		Path caminho = Paths.get("/home/robson/Desenvolvimento/EstudoNIO2/EstudoNIO2.txt");
		try {
			if (!Files.exists(pasta)) {
				System.out.println("Criando diretorio...");
				Files.createDirectories(pasta);
			}
			
			if (!Files.exists(caminho)) {
				System.out.println("Criando arquivo...");
				Files.createFile(caminho);
			}
			
			List<String> linhas = Files.readAllLines(caminho, Charset.defaultCharset());
			linhas.add("Minha linha de escrita");
			System.out.println("Escrevendo...");
			Files.write(caminho, linhas, Charset.defaultCharset());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Files file
	}
	
}
