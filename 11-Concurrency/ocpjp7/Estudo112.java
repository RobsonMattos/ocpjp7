package ocpjp7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 11.2 - Use Lock, ReadWriteLock, and ReentrantLock classes in the java.util.concurrent.locks 
// 		   package to support lock-free thread-safe programming on single variables.
public class Estudo112 {
	ReentrantReadWriteLock rw1 = new ReentrantReadWriteLock();
	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock(); // boolean locked = lock.tryLock() | lock.tryLock(5, TimeUnit.SECONDS);
		try {
			// do work here
		} finally { lock.unlock(); }
	}

	public void m1() {
		Lock lock = rw1.readLock(); // rw1.readLock().lock(); tambem funciona
		try {
			// do work here
		} finally { lock.unlock(); }
	}

	public void m2() {
		Lock lock = rw1.writeLock();  // rw1.writeLock().lock(); tambem funciona
		try {
			// do work here
		} finally { lock.unlock(); }
	}
}