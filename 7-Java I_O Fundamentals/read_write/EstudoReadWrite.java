package read_write;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.Familia;

public class EstudoReadWrite {

	List<Familia> familia = new ArrayList<>();
	File file = new File("familia.txt");
	public static void main(String[] args) {
		
		
		
	}
	
	static void carregar() {
		Path path = Paths.get("familia.txt");
//		File file = Files.
//		FileReader reader = new FileReader(null);
//		BufferedReader br = new BufferedReader(br);
	}

}
