import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EstudoPath {

	public static void main(String[] args) {
		// NIO, access components, test and compare, file operations, throws IOExceptions
		Path path = Paths.get("xanadu.txt");
		Path diretorio = Paths.get("/home/robson/Desenvolvimento/MyDiretory");
		Path destino = Paths.get("/home/robson/Desenvolvimento/MyDiretory/xanadu-copy.txt");
		
		try {
			if(Files.exists(diretorio)) {
				System.out.println("Diretorio já existe");
				if(Files.exists(path)){
					System.out.println("Arquivo já existe!");
				} else {
					Files.copy(path, destino); // FileAlreadyExistsException:
				}
			} else {
				Files.createDirectory(diretorio); // FileAlreadyExistsException:
				Files.copy(path, destino); // FileAlreadyExistsException:
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
