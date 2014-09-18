package dao;

import java.util.Map;
import java.util.NavigableMap;

import model.Familia;

public class FamiliaMapDao {

	public Map<Integer, Familia> getLista(Map<Integer, Familia> lista) {

		lista.put(1, new Familia(46, "Robson", "Mattos"));
		lista.put(2, new Familia(48, "Suely", "Sandra"));
		lista.put(3, new Familia(21, "Junior", "Mattos"));
		lista.put(4, new Familia(18, "Caio", "Souza"));

		// Map não permite duplicatas
		lista.put(1, new Familia(46, "Robson", "Mattos"));

		return lista;
	}

	public NavigableMap<Integer, Familia> getLista(
			NavigableMap<Integer, Familia> map) {
		
		map.put(1, new Familia(46, "Teste", "Mattos"));
		map.put(2, new Familia(48, "Suely", "Sandra"));
		map.put(3, new Familia(21, "Junior", "Mattos"));
		map.put(4, new Familia(18, "Caio", "Mattos"));
		map.put(1, new Familia(22, "Robson", "Mattos"));
		
		return map;
	}

}
