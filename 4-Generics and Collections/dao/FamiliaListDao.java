package dao;

import java.util.List;

import model.Familia;

//Interface List
// Implementation: ArrayList, LinkedList, Vector

public class FamiliaListDao {

	public List<Familia> getLista(List<Familia> lista) {

		lista.add(new Familia(46, "Robson", "Mattos"));
		lista.add(new Familia(48, "Suely", "Sandra"));
		lista.add(new Familia(21, "Junior", "Mattos"));
		lista.add(new Familia(18, "Caio", "Souza"));

		// List permite duplicatas
		lista.add(new Familia(46, "Robson", "Mattos"));

		return lista;
	}

}
