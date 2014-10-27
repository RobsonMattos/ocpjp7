
// 10.1 - Create and use the Thread class and the Runnable interface

// Pode-se extender ou implementar Runnable
public class Estudo101 {

	
	public static void main(String[] args) {
		Extendendo e = new Extendendo();
		Implementando i = new Implementando(); // pode-se usar polimorfismo (Runnable r = new Implementando())
		Thread thread  = new Thread(i);		   // state New	
		
		e.setName("Extendendo");// setando no nome
		thread.setName("Imlementando");
// -----------------------------------------------------------------------------------------------
		e.start(); // roda a thread | chamar o método run() tambem roda mais não inicia uma thread
		thread.start(); // a ordem de execução não é garantida
	}
}

class Extendendo extends Thread {
	public void run() {
		for (int i = 0; i<=5; i++) {
			System.out.println("Executando " + Thread.currentThread().getName() + "...");
		}
	}
}

class Implementando implements Runnable {
	public void run() {
		for (int i = 0; i<=5; i++) {
			System.out.println("Executando " + Thread.currentThread().getName() + "...");
		}
	}
}
