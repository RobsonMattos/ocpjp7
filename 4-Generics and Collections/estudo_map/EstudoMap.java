package estudo_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import model.Familia;
import dao.FamiliaMapDao;

// Map implementations are grouped into general-purpose, special-purpose, and concurrent implementations.
// Interface Map; Implementacao HashMap, TreeMap e LinkedHashMap. 
public class EstudoMap {

	public static void main(String[] args) {
		// maximum speed and don't care about iteration order
		// carregar(new HashMap<Integer, Familia>());
		
		// SortedMap operations or key-ordered Collection-view iteration
		// carregar(new TreeMap<Integer, Familia>());
		
		// near-HashMap performance and insertion-order iteration
		Map<Integer, Familia> map = new LinkedHashMap<Integer, Familia>();
		print(new FamiliaMapDao().getLista(map));
		metodos(new FamiliaMapDao().getLista(new TreeMap<Integer, Familia>()));
		
	}
	
	private static void print(Map<Integer, Familia> map) {
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
	
	private static void metodos(NavigableMap<Integer, Familia> map) {
		System.out.println(map.firstEntry()); // retorna Map.Entry
	}
}
