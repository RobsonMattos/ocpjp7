package estudo_set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

import model.Familia;
import dao.FamiliaSetDao;

// Interface: Set cannot contain duplicate elements (usa o codigo de hash); não aceita primitivos apenas objetos
// Implementation: HashSet no predictable order; TreeSet iterator list is order by Comparator (compareTo);
//		           LinkedHashSet ordernado como são inseridos
public class EstudoSet {

	public static void main(String[] args) {
		//HashSet e LinkedHashSet não garate ordernacao
		// Set<Familia> hashSet = new FamiliaDao().getLista(new HashSet<Familia>()); 
		Set<Familia> tree = new TreeSet<Familia>();
		
		print(tree);
		metodos(new FamiliaSetDao().getLista(new ConcurrentSkipListSet<Familia>()));
	}

	private static void print(Set set) {
		for (Iterator<Familia> iterator = set.iterator(); iterator.hasNext();) {
			Familia familia = iterator.next();
			System.out.println(familia.getNome());
		}
	}
	
	static void metodos(ConcurrentSkipListSet<Familia> set) {
		// retorna um conjunto menor que headSet()
		NavigableSet<Familia> n =  (NavigableSet<Familia>) set.headSet(new Familia(46, "Robson", "Mattos"));
		System.out.println(n);
	}
}
