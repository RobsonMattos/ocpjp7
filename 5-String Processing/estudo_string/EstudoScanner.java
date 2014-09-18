package estudo_string;

import java.util.Scanner;

public class EstudoScanner {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um texto:");
		m1();
	}
	
	static void m1() {
		String input = "10 apples 20 oranges 33 pears";
		Scanner sc = new Scanner(input);
		sc.useDelimiter("//s"); // apenas /s não compila
		print(sc);
		sc.useDelimiter("//d");
		print(sc);
	}
	
	static void print(Scanner sc) {
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
//		float numF = sc.nextFloat(); 
//		int num1 = sc.nextInt(); 
//		byte byte1 = sc.nextByte(); 
//		long lg1 = sc.nextLong(); 
//		boolean b1 = sc.nextBoolean(); 
//		double num2 = sc.nextDouble(); 
//		String nome = sc.nextLine();
	}

}
