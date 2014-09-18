package estudo_queue;

import java.util.PriorityQueue;

// The Queue implementations are grouped into general-purpose and concurrent implementations.
// Interface queue - providing first in, first out (FIFO) queue operations for add, poll, peek
// Implementation PriorityQueue

public class EstudoQueue {

	public static void main(String[] args) {
		
		PriorityQueue< String> q = new PriorityQueue<String>();
		
		q.offer("Robson"); // pode-se usar add
		q.offer("Sandra");
		q.offer("Junior");
		q.offer("Caio");
		
		System.out.println(q);        // [Caio, Junior, Robson, Sandra]
		
		System.out.println(q.peek()); // Caio
		System.out.println(q);        // [Caio, Junior, Robson, Sandra]
		
		System.out.println(q.poll()); // Caio
		System.out.println(q);        // [Junior, Sandra, Robson]
		
		
		PriorityQueue< String> p = new PriorityQueue<String>();
		p.add("banana");
		p.add("pear");
		p.add("apple");
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll() + " " + p.peek());
	}

}
