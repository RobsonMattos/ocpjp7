package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

// Item 3: Read and change file and directory attributes.
// 	- Managing Metadata (File and File Store Attributes)
public class LendoAtributos {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("familia.txt");
		Map map = Files.readAttributes(path, "*");
		for(Object key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
	// -----------------------------------------------------------------------------------
		BasicFileAttributes att = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("--------------------------------------------------------------");
		System.out.println(att.creationTime());
	}
}
