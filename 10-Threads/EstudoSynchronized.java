// sychronized podem em métodos static e não podem em construtor
// estados new, runnable, blocked, waiting, timed_waiting, terminated
// a ordem de execução é indeterminada
public class EstudoSynchronized {

	public static void main(String[] args) {
		// Cria conta conjunta da família
		final Conta conta = new Conta(100000);
		// Cria familiares e lhes informa a conta conjunta
		Correntista pai = new Correntista("Pai ", conta);
		Correntista mae = new Correntista("Mãe ", conta);
		Correntista filho = new Correntista("Filho", conta);
		// Inicia as threads
		pai.start();
		mae.start();
		filho.start();
	}
}