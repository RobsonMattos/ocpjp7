package estudo_list;

import java.util.ArrayList;
import java.util.List;

import model.Familia;

// Interface: List
// Implementacao: ArrayList, LinkedList(Baixa performance, tb implementa queue), Vector(legado)
// Permite elementos duplicados e mantém uma ordenação específica entre os elementos.
public class EstudoList {
	
	// toArray rtorna um Object[]
	public static void main(String[] args) {

		carregarLista();
	}

	private static void carregarLista() {
		// capacidade default 10, mas o tamanho pode ser indicado no construtor
		List<Familia> familias = new ArrayList<Familia>();
		
		familias.add(new Familia(46, "Robson", "Mattos"));
		familias.add(new Familia(46, "Robson", "Mattos")); // aceita duplicata (objetos iguais)
		
		System.out.println(familias);
	}
}
