package estudo_list;

import java.util.ArrayList;

import model.Familia;

// permite elementos duplicados e mantém uma ordenação específica entre os elementos.
public class EstudoArrayList {

	public static void main(String[] args) {

		carregarLista();
	}

	private static void carregarLista() {
		// capacidade default 10, mas o tamanho pode ser indicado no construtor
		ArrayList<Familia> familias = new ArrayList<Familia>();
		
		System.out.println(familias);
	}

}
