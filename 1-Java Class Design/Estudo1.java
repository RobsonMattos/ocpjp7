
class SuperEstudo {
	String nome;
	
	void print() {System.out.println("Super...");}
}

public class Estudo1 extends SuperEstudo {
	String sobrenome;
	
	void print() {System.out.println("Sub...");}
	void print2() {System.out.println("print2...");}
	
	public static void main(String[] args) {
		SuperEstudo superEstudo = new SuperEstudo();
		Estudo1 estudo1 = new Estudo1();
		// Estudo1 estudo1 = (Estudo1) new SuperEstudo(); // DownCast lanca ClassCastException
		SuperEstudo superEstudo2 = (SuperEstudo)estudo1; // UpCast perde metodos e propriedades
		
		superEstudo2.print();
	}

}