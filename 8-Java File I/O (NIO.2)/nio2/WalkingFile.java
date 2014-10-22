package nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

// Item 4: Recursively access a directory tree.
// 	- Walking the File Tree
public class WalkingFile { // podemos estender a classe SimpleFileVisitor

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/robson/Desenvolvimento/pet");
		FileVisitor<Path> search = new MyVisitor();
		Files.walkFileTree(path, search);
	}

}

class MyVisitor extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
	          throws IOException {
	    
		BasicFileAttributes att = Files.readAttributes(file, BasicFileAttributes.class);
		
		System.out.println(file + " - " + att.size());
	    return FileVisitResult.CONTINUE;
	  }
	
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("-------------------------------------------------");
		System.out.println(dir);
		return FileVisitResult.CONTINUE;
	}
	
}