package nested_classes;

public class ClasseStatica {

	String nome = "Robson";
	
	static class Nested {
		String sobreNome = "Mattos";
		void m1() {
			System.out.println("Classe statica interna...");
			// System.out.println(nome); // não tem acesso a atributo e métodos não static
			System.out.println(sobreNome);
		}
	}
	
	public static void main(String[] args) {
		
		ClasseStatica.Nested nested = new ClasseStatica.Nested();
		nested.m1();
	}

}
