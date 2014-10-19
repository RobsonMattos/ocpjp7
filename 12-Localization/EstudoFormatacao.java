import java.text.NumberFormat;
import java.util.Locale;

// Item 4: Format text for localization by using NumberFormat and DateFormat.
// 	- Numbers and Currencies
// 	- Dates and Times
public class EstudoFormatacao {

	public static void main(String[] args) {
		// sempre com getInstance
		NumberFormat nf = NumberFormat.getInstance(Locale.JAPANESE);
		System.out.println(nf.format(6549879));
		System.out.println(NumberFormat.getCurrencyInstance().format(1232154656));
		System.out.println(NumberFormat.getPercentInstance().format(0.12));
	}

}
