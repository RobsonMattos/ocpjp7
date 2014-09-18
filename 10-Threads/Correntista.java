public class Correntista extends Thread {
	private static Banco banco = new Banco();
	private Conta conta = null;
	private double valor = 100;

	public Correntista(String nome, Conta conta) {
		super(nome);
		this.conta = conta;
	}

	public void run() {
		// synchronized (this) { // sincronização de bloco
			double total = 0;
			while (banco.saque(conta, valor))
				total += valor;
			System.out.println(getName() + " sacou total de R$" + total);
		// }
	}

}
