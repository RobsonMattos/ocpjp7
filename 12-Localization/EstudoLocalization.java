import java.text.NumberFormat;
import java.util.Locale;

// Item 1: Read and set the locale by using the Locale object..
// 	- Setting the Locale
// 	- Creating a Locale
public class EstudoLocalization {
	
	// Locale aLocale = new Locale.Builder().setLanguage("fr").setRegion("CA").build(); // Locale.Builder Class
	// aLocale = new Locale("fr", "CA"); // Locale Constructors
	// cLocale = Locale.JAPAN; // Locale Constants
	
	public static void main(String[] args) {
		String outputString = new String();
		Locale[] thaiLocale = {
		             new Locale("th"),
		             new Locale("th", "TH"),
		             new Locale("th", "TH", "TH")
		         };

		for (Locale locale : thaiLocale) {
		    NumberFormat nf = NumberFormat.getNumberInstance(locale);
		    outputString = outputString + locale.toString() + ": ";
		    outputString = outputString + nf.format(573.34) + "\n";
		    System.out.println(outputString);
		}
	}
}
