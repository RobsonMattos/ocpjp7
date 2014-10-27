
// 10.3 - Synchronize thread access to shared data

// Apenas métodos ou blocos podem ser sincronizados, não variaveis ou classes
public class Estudo103104 implements Runnable {
// wait() -  put me waiting pool and notify me when something happens
// notify() - send a signal to one and only one of the thread that are wating in the same object's wating pool
// notifyAll() - works in the same way as notify, only it sends the signal to all of the theads waiting on the object
	
	public static void main(String[] args) {
		new Thread(new Estudo103104(), "Caio").start();
		new Thread(new Estudo103104(), "Robson").start();
	}
	
//	public synchronized void print() { // métodos static tb podem ser synchronized 
//		// é a mesma coisa que synchronized(this)
//		
//	}
	
	public void run() {
		String nome = "Robson";
		synchronized (nome) {     // CaioCaioRobsonRobson | Sem sinchronyzed: CaioRobsonCaioRobson
			try {
				System.out.print(Thread.currentThread().getName());
				Thread.currentThread().sleep(3000);
				System.out.print(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
