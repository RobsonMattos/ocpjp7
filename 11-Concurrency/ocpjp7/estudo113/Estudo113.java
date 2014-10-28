package ocpjp7.estudo113;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 11.3 -  Use Executor, ExecutorService, Executors, Callable, and Future to execute tasks using thread pools.
public class Estudo113 {
// java.util.concurrent.Executor - tem apenas o método execute()
	public static void main(String[] args) throws Exception {
		final ExecutorService pool = Executors.newFixedThreadPool(5);
		List<Callable<Integer>> cal = new ArrayList<Callable<Integer>>();
		cal.add(new Task2());
		cal.add(new Task1());
		List<Future<Integer>> futures = pool.invokeAll(cal);
		for(Future<Integer> future : futures) {
			System.out.println("Task " + future.get());
		}
		
		pool.shutdownNow();
	}
}

class Task1 implements Callable<Integer> {
	@Override
	public Integer call() throws Exception { return 1; }
}

class Task2 implements Callable<Integer> {
	@Override
	public Integer call() throws Exception { return 2; }
}