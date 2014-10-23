import java.io.File;
import java.io.IOException;

// createNewFile, delete, exists, isDirectory, isFile, list, mkDir, renameTo
public class EstudoFile {

	public static void main(String[] args) {
		try {
			File file = new File("EstudoFile.txt");
			System.out.println(file.exists());
			System.out.println(file.createNewFile()); // se não existir cria o arquivo
			System.out.println(file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
