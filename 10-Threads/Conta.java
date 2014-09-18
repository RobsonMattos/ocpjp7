public class Conta {
	private double saldo = 0;

	public Conta(double saldo) {
		this.saldo = saldo;
		System.out.println("Saldo inicial = " + saldo);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
