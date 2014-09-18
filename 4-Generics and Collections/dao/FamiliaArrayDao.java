package dao;

import model.Familia;

public class FamiliaArrayDao {
	
	public Familia[] getArray() {
		Familia[] familiaArray = new Familia[4];

		familiaArray[0] = new Familia(46, "Robson", "Mattos");
		familiaArray[1] = new Familia(48, "Suely", "Sandra");
		familiaArray[2] = new Familia(21, "Junior", "Mattos");
		familiaArray[3] = new Familia(18, "Caio", "Mattos");

		return familiaArray;
	}
	
}
