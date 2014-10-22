package heranca;

import java.io.IOException;

// cuidado com metodo finalize() que lança Trowble;

interface I3 {
	String nome = "Robson"; // public static final
}

class SuperClasse {
	void m1() throws IOException {}
}

public class EstudoHeranca extends SuperClasse implements I3 {
	
//	String nome; // pode override declaracao
	
	public static void main(String[] args) {
		System.out.println(EstudoHeranca.nome);
		
		EstudoHeranca estudo3 = new EstudoHeranca();
		// estudo3.nome = "Mattos"; nao pode propriedade eh static final
		System.out.println(estudo3.nome);
	}

	// ------------------------------------------------------------------------
	// lança exception apenas se o método da super lançar
	void m1() {} //modificadores igual ou mais permissivo
	
}
