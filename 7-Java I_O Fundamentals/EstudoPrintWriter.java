import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

// format, printf, print, println, write, close, flush
public class EstudoPrintWriter {

	public static void main(String[] args) {
		String str = "Escrevendo algo (EstudoPrintWriter)";
		try {
			File file  = new File("EstudoFile.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.println(str);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
