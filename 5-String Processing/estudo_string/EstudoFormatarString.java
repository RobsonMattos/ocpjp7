package estudo_string;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

// Cuidado com autoboxing
// a{3} tres ocorrencia de a(aaa)
public class EstudoFormatarString {

	public static void main(String[] args) {
		float f = 3.31f;
		int i = 44;

		// IllegalFormatConversionException(transformar float em decimal) |
		// f(float), d(decimal), n(new Line)
		System.out.format(Locale.FRANCE, "O valor é: %f%n "
				+ "e em decimal é: %d", f, i); 					// Locale padrao é English

		long n = 461012;
		System.out.format("%d%n", n); 							// --> "461012"
		System.out.format("%08d%n", n); 						// --> "00461012"
		System.out.format("%+8d%n", n); 						// --> " +461012"
		System.out.format("%,8d%n", n); 						// --> " 461,012"
		System.out.format("%+,8d%n%n", n); 						// --> "+461,012"

		double pi = Math.PI;

		System.out.format("%f%n", pi); 							// --> "3.141593"
		System.out.format("%.3f%n", pi); 						// --> "3.142"
		System.out.format("%10.3f%n", pi); 						// --> "     3.142"
		System.out.format("%-10.3f%n", pi); 					// --> "3.142"
		System.out.format(Locale.FRANCE, "%-10.4f%n%n", pi); 	// --> "3,1416"
												
		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c); 			// --> "May 29, 2006"
		System.out.format("%tl:%tM %tp%n", c, c, c); 			// --> "2:34 am"
		System.out.format("%tD%n", c); 							// --> "05/29/06"

		customFormat("###,###.###", 123456.789); 				// 123456.789  ###,###.###  123,456.789
		customFormat("###.##", 123456.789);						// 123456.789  ###.##  123456.79
		customFormat("000000.000", 123.78);						// 123.78  000000.000  000123.780
		customFormat("$###,###.###", 12345.67);					// 12345.67  $###,###.###  $12,345.67
		customFormat("#,#.#", 12345.61);						// 12345.61  #,#.#  1.2.3.4.5,6
		
		String h = "hello";
		Formatter formatter = new Formatter();
		formatter.format("%S", h);
		System.out.println(formatter);							// HELLO
	}

	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}
	
}