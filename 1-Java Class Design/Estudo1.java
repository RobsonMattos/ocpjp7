
enum Tipo {
	VENDAS, COMPRAS
}

public class Estudo1 {
	private static Tipo tipo;

	public enum Tamanho {
		PEQUENO(10), MEDIO(20), GRANDE(30);
		
		Tamanho(Integer quantidade) {
			this.quantidade = quantidade;
		}
		
		private Integer quantidade;
	}
	
	public static void main(String[] args) {
		
		System.out.println(tipo.VENDAS);
		System.out.println(Tamanho.PEQUENO.quantidade);
	}
	
}
