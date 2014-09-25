package heranca;

interface I3 {
	String nome = "Robson"; // public static final
}

public class EstudoHeranca implements I3 {
	
//	String nome; // pode override declaracao
	
	public static void main(String[] args) {
		System.out.println(EstudoHeranca.nome);
		
		EstudoHeranca estudo3 = new EstudoHeranca();
		// estudo3.nome = "Mattos"; nao pode propriedade eh static final
		System.out.println(estudo3.nome);
	}

}
