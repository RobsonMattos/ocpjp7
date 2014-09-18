package estudo_enum;

public class EstudoEnum {
	// Quando um enum é declarado dentro de uma classe, ele pode ter os
	// seguintes modificadores de acesso:
	// public, default, protected e private
	// não podem ser declarados dentro de métodos!
	enum Cofee {
		BIG(1000), MEDIUM(500), PEQUENO(250);
		
		// os argumentos após o valor do enum são passados como valores para o construtor
		Cofee(Integer quantidade) {
			this.quantidade = quantidade;
		}

		private Integer quantidade; // pode ser final

		// Geters e Seters
	}

	public static void main(String[] args) {
		for (Day dia : Day.values()) {
			System.out.println(dia);
		}

		System.out.println(Cofee.BIG.quantidade);
	}

}