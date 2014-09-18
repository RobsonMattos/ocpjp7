package criando_usando_pacotes.pacotea;

public class ClassePacoteA {
	
	public void m2() {
		System.out.println("Metodo m2...");
		
		criando_usando_pacotes.pacoteb.ClassePacoteB.m1();
	}
	
}
