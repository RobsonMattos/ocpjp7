package estudo_array;

import java.util.Arrays;

import dao.FamiliaArrayDao;
import model.Familia;

// Array aceita primitivos e objetos
// tamanho fixo, boa performance
public class EstudoArray {

	public static void main(String[] args) {
		
		Familia[] familia = new FamiliaArrayDao().getArray();
		print(familia);
		
		// Arrays.sort aceita como parametro apenas arrays
		// Se os elmentos não forem do mesmo tipo lança ClassCastException
		Arrays.sort(familia); 
		print(familia);
	}

	private static void print(Familia[] array) {
		for (Familia f :array) { System.out.print(f + " "); }
		System.out.println();
	}
	
}
