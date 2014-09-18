package casting;

class SuperEstudo {
	String nome;
	
	void print() {System.out.println("Super...");}
}

public class EstudoCasting extends SuperEstudo{

String sobrenome;
	
	void print() {System.out.println("Sub...");}
	void print2() {System.out.println("print2...");}
	
	public static void main(String[] args) {
		EstudoCasting estudo = new EstudoCasting();
		// EstudoCasting estudo = (EstudoCasting) new SuperEstudo(); // DownCast lanca ClassCastException
		// String str = (String) estudo; // Erro de compilacao
		SuperEstudo superEstudo = (SuperEstudo)estudo; // UpCast perde metodos e propriedades
		
		superEstudo.print();
	}

}
