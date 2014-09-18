package estudo_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Familia;
import dao.FamiliaListDao;

public class EstudoCollections {

	public static void main(String[] args) {
List<Familia> lista = new FamiliaListDao().getLista(new ArrayList<Familia>());
		
		print(lista); // [Robson, Suely, Junior, Caio, Robson]
		
		Collections.sort(lista);
		print(lista); // [Caio, Junior, Robson, Robson, Suely]
		
		Collections.sort(lista, new SortNome());
		print(lista); // [Junior, Robson, Robson, Suely, Caio]
		
		Collections.reverse(lista);
		print(lista); // [Caio, Suely, Robson, Robson, Junior]
	}
	
	private static void print(List<Familia> lista) {
		System.out.println(lista);
	}
	
	static class SortNome implements Comparator<Familia> {
		@Override
		public int compare(Familia o1, Familia o2) { return o1.getSobreNome().compareTo(o2.getSobreNome()); }
	}
}