package nested_classes;

public class ClasseStatica {

	static class Nested {
		void m1() {
			System.out.println("Classe statica interna...");
		}
	}
	
	public static void main(String[] args) {
		
		ClasseStatica.Nested nested = new ClasseStatica.Nested();
		nested.m1();
	}

}
