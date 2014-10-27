// 10.2 - Manage and control thread lifecycle

// States: New, Runnable, Running, Waiting/blocked/sleeping, Dead
public class Estudo102 {
// yield - move back to runnable | join = stop executing
	public static void main(String[] args) {
		Runnable myThread = new MyThread();
		Thread caio = new Thread(myThread); // state New | mesma prioridade que main
		Thread junior = new Thread(myThread); // state New
		caio.setName("Caio");
		junior.setName("Junior");
		// ------------------------------------------------------------------------------------------
		// Após executar o método start o state é Runnable
		caio.setPriority(Thread.MAX_PRIORITY); // MIN_PRIORITY(1), NORM_PRIORITY()5, MAX_PRIORITY(10) | 1 - 10 
		caio.start(); // Quando estiver rodando Running depende do scheduler
		junior.start();
	}
}

class MyThread implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}