package comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Familia;
import dao.FamiliaListDao;

public class CollectionsSortExample {

	public static void main(String[] args) {
		
		List<Familia> lt = new FamiliaListDao().getLista(new ArrayList<Familia>());
		
		System.out.println(lt); // [Robson, Suely, Junior, Caio]
		
		// ordenacao natural
		Collections.sort(lt); // se a classe não implementar Comparable não compila
		System.out.println(lt); // [Caio, Junior, Robson, Suely]
		
		Sort sort = new Sort();
		Collections.sort(lt, sort);
		System.out.println(lt); // [Caio, Robson, Junior, Suely]
	}
	
	static class Sort implements Comparator<Familia> {
		// 
		public int compare(Familia o1, Familia o2) { 
			return o1.getSobreNome().compareTo(o2.getSobreNome()); 
		}
	}
}
