import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// 8.1 - Operate on file and directory paths with the Path class
// 8.2 - Check, delete, copy, or move a file or directory with the Files class  
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
