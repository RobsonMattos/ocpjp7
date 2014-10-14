import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Estudo1 {
	
	public static void main(String[] args) {
		String nome = "Robson Mattos";
		String busca = "Ma";
		Pattern pattern = Pattern.compile(busca);
		Matcher matcher = pattern.matcher(nome);
		
		while (matcher.find()) {
			System.out.println("Encontrou " + busca + " em " +  + matcher.start());
			System.out.println("Match: " + matcher.group());
		}
		
	}
	
}