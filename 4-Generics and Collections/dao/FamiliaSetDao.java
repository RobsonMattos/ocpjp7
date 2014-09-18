package dao;

import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

import model.Familia;

public class FamiliaSetDao {
	
	public TreeSet<Familia> getLista(TreeSet<Familia> set) {
		
		set.add(new Familia(46, "Robson", "Mattos"));
		set.add(new Familia(48, "Auely", "Sandra"));
		set.add(new Familia(21, "Junior", "Robson"));
		set.add(new Familia(18, "Caio", "Mattos"));

		return set;
	}
	
	public ConcurrentSkipListSet<Familia> getLista(
			ConcurrentSkipListSet<Familia> set) {

		set.add(new Familia(46, "Robson", "Mattos"));
		set.add(new Familia(48, "Auely", "Sandra"));
		set.add(new Familia(21, "Junior", "Robson"));
		set.add(new Familia(18, "Caio", "Mattos"));

		return set;
	}
	
}
