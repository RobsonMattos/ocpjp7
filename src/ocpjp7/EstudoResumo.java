package ocpjp7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class EstudoResumo {

	public static void main(String[] args) {
		Path path = Paths.get("EstudoFile.txt");
		
		try {
			BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println(basic.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
