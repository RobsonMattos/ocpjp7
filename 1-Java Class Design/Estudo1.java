
class SuperEstudo {
	void print() { System.out.println("Super..."); }
}

public class Estudo1 extends SuperEstudo {
	
	void print() { System.out.println("");  }
	
	public static void main(String[] args) {
		// DownCast
		Estudo1 estudo1 = (Estudo1) new SuperEstudo(); // Lança ClassCastException
		
		//UpCast
		SuperEstudo superEstudo = new SuperEstudo();
	}

}