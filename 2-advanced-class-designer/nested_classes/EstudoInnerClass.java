package nested_classes;

// Modificadores: private, public, and protected 
// There are two special kinds of inner classes: local classes and anonymous classes.
public class EstudoInnerClass {
	private String nome = "Robson";
	
	private class InnerTeste { // local classe
		void printNome(){
			System.out.println(nome);
			System.out.println(this); // referencia a classe interna 
			System.out.println(EstudoInnerClass.this); // referencia a classe esterna
		}
	}
	
	public static void main(String[] args) {
		EstudoInnerClass estudoInnerClass = new EstudoInnerClass();
		EstudoInnerClass.InnerTeste innerTeste1 = estudoInnerClass.new InnerTeste();
		// ---------------
		EstudoInnerClass.InnerTeste innerTeste2 = new EstudoInnerClass().new InnerTeste();
		innerTeste2.printNome();
	}
	
	private void teste() {
		class Nome { 	
			// ...
		}
	}
}
