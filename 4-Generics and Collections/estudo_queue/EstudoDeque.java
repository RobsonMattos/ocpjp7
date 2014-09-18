package estudo_queue;

import java.util.ArrayDeque;


// The Deque interface - addFirst, addLast, removeFirst, removeLast, getFirst and getLast
// ArrayDeque class is the resizable array
public class EstudoDeque {

	public static void main(String[] args) {
		ArrayDeque<String> aDeque = new ArrayDeque<String>();
		
		aDeque.add("Robson");
		aDeque.add("Sandra");
		aDeque.add("Junior");
		aDeque.add("Caio");
		
		for (String str : aDeque) {
		    System.out.println(str);
		}
	}

}
