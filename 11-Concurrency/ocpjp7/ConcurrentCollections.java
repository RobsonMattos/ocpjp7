package ocpjp7;

import java.util.concurrent.ConcurrentMap;

//1 - BlockingQueue defines a first-in-first-out data structure that blocks or times out when you 
//	attempt to add to a full queue, or retrieve from an empty queue.
//2 - ConcurrentMap is a subinterface of java.util.Map that defines useful atomic operations. 
//	These operations remove or replace a key-value pair only if the key is present, or add a key-value pair only if the key is absent. Making these operations atomic helps avoid synchronization. The standard general-purpose implementation of ConcurrentMap is ConcurrentHashMap, which is a concurrent analog of HashMap.
//3 - ConcurrentNavigableMap is a subinterface of ConcurrentMap that supports approximate matches. The standard general-purpose implementation of ConcurrentNavigableMap is ConcurrentSkipListMap, which is a concurrent analog of TreeMap.

public class ConcurrentCollections {

	public static void main(String[] args) {
		// ConcurrentMap<K, V> // Extends Map

	}

}
