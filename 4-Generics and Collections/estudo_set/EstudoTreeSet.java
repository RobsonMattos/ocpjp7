package estudo_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import dao.FamiliaSetDao;
import model.Familia;

// Se o objeto a ser inserido no conjunto não puder ser comparado ança ClassCastError
public class EstudoTreeSet {

	public static void main(String[] args) {

		TreeSet<Familia> treeSet = new FamiliaSetDao()
				.getLista(new TreeSet<Familia>());
		System.out.println(treeSet); // [Auely, Caio, Junior, Robson]

		// -----------------------------------
		// cuidado ao inserir um novo objeto em um subTree pode estar fora do range
		TreeSet<Familia> subTreeSet = (TreeSet<Familia>) treeSet.subSet(new Familia(48, "Auely",
				"Sandra"), new Familia(21, "Junior", "Robson"));
		System.out.println(subTreeSet); // [Auely, Caio]
	}

	private static void print(Set set) {
		for (Iterator<Familia> iterator = set.iterator(); iterator.hasNext();) {
			Familia familia = iterator.next();
			System.out.println(familia.getNome());
		}
	}
}
