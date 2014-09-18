package read_write_console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// A path is either relative(joe/foo ) or absolute(/home/sally/statusReport)
public class EstudoFile {

	public static void main(String[] args) {
		Path path = Paths.get("/home/robson/Desenvolvimento/RobsonTeste.txt");
		try {
			deletar(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Verifying the Existence of a File or Directory
	static boolean m1(Path path) {
		if (Files.exists(path))
			return true;
		else
			return false;
	}
	
	// NoSuchFileException,	DirectoryNotEmptyException,	IOException
	static void deletar(Path path) throws IOException {
		Files.delete(path);
	}

}
