package nested_classes.anonymous;

public class ClassAnonymous {

	interface Veiculo {
		void ligar();
		void desligar();
	}
	
	void m1() {
		
		Veiculo carro = new Veiculo() {
			
			@Override
			public void ligar() {
				System.out.println("Ligando carro...");
			}
			
			@Override
			public void desligar() {
				System.out.println("Desligando o carro...");
			}
		};
		
		Veiculo moto = new Veiculo() {
			
			@Override
			public void ligar() {
				System.out.println("Ligando moto...");
			}
			
			@Override
			public void desligar() {
				System.out.println("Desligando moto...");
			}
		};
		
		carro.ligar();
	}
	
	public static void main(String[] args) {
		ClassAnonymous classAnonymous = new ClassAnonymous();
		classAnonymous.m1();
	}
}