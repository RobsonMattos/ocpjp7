package estudo_string;

import java.text.DecimalFormat;

public class EstudoDecimalFormat {

	public static void main(String[] args) {
		
		String s = "2345.208";
		DecimalFormat df = new DecimalFormat("###.##");
		System.out.println(df.format(s)); // IllegalArgumentException
	}

}
