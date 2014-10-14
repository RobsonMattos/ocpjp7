package estudo_string;

import java.text.DecimalFormat;

public class EstudoDecimalFormat {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###.##");
		String s = df.format(32112.255);
		System.out.println(s); // IllegalArgumentException
	}

}
