package ocpjp7;

import java.util.concurrent.atomic.AtomicInteger;

public class Estudo1121 {

	private AtomicInteger value = new AtomicInteger(10);
	
	public static void main(String[] args) {
		
		Estudo1121 at = new Estudo1121();
		
		at.value.weakCompareAndSet(10, 15); // at.value.addAndGet(5)
		
		System.out.println(at.value.intValue());
	}

}
