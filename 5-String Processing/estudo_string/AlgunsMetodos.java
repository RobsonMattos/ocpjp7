package estudo_string;

public class AlgunsMetodos {

	public static void main(String[] args) {
		// m2();
		m4();
	}
	
	// Converting Numbers to Strings
	static void m1() {
		System.out.println(String.valueOf(11));
	}
	
	static void m2() {
		String nome = "Robson Mattos"; // conta de 0 até o lenght - 1 (neste caso 1 a 13) 
		System.out.println(nome.substring(7, 13)); // Mattos
		System.out.println(nome.substring(7)); // Mattos
		System.out.println(nome.replace('a', 'o')); // Robson Mottos
	}
	
	static void m3() {
		float a = (Float.valueOf("11")).floatValue();
		System.out.println(a);
		 
		a = Float.parseFloat("12"); // parseFloat()) that can be used to convert strings to primitive
		System.out.println(a);
	}
	
	// Split
	static void m4() {
		String nome = "Robson:Mattos";
		String[] partes = nome.split(":");
		for (String s : partes) {
			System.out.println(s);
		}
	}

}
