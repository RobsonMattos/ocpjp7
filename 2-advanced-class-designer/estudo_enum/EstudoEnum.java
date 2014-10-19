package estudo_enum;

// public, default, protected e private
// não podem ser declarados dentro de métodos!
public class EstudoEnum {
	enum Cofee {
		BIG(1000), MEDIUM(500), PEQUENO(250);
		
		// os argumentos após o valor do enum são passados como valores para o construtor
		Cofee(Integer quantidade) { this.quantidade = quantidade; }

		private Integer quantidade; // pode ser final

		// Geters e Seters
	}

	public static void main(String[] args) {
		for (Day dia : Day.values()) {
			System.out.print(dia + " "); // SANDAY MONDAY TUESDAY WEDNESDAY THURSDAY FRIDAY SATURDAY
		}
		System.out.println();
		// ------------------------------------------------
		System.out.println(Cofee.BIG.quantidade); // obtendo o valor de BIG // 1000
		// ------------------------------------------------
		Day dia = Day.valueOf("SUNDAY"); // se passar valor errado - IllegalArgumentException: No enum constant estudo_enum.Day.SANDAY
		System.out.println(dia); // SUNDAY
	}

}