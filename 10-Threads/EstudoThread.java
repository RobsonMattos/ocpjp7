
// Extends Thread ou Implements Runnable
// synchronized apenas metodos, cada objeto possue apenas um bloqueio
public class EstudoThread {

	public static void main(String[] args) throws InterruptedException {
		TesteThread t1 = new TesteThread("Thread extending of Thread...");
		TesteOtherThread testeOtherThread = new TesteOtherThread();
		Thread t2 = new Thread(testeOtherThread);
		Thread t3 = new Thread(new Runnable() { public void run() {System.out.println("3 thread...");} });
		
		t1.start();
		t2.start();
		t3.start();
		t2.interrupt(); // interrope um sleep
		t2.join(); // aguarda a thread terminar ou morrer
		System.out.println("Programa terminou");
	}
}

class TesteThread extends Thread {
	private String msg;
	
	public TesteThread(String msg){ this.msg = msg; }
	
	public void run() {
		for(int i=0; i<=4; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TesteOtherThread implements Runnable {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread implements Runnable...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Interrompido...");
				break;
			}
		}
	}
}