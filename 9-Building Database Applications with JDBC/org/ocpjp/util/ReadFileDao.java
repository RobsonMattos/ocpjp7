package org.ocpjp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.ocpjp.model.Familia;

public class ReadFileDao {
	
	public List<Familia> membros = new ArrayList<>();
	
	public List<Familia> getMembros() {
		Path path = Paths.get("familia.txt");
		String[] array = new String[3];
		List<Familia> lista = new ArrayList<Familia>();
		
		try (BufferedReader br = Files.newBufferedReader(path,  StandardCharsets.UTF_8)) {
			String linha = null;
			while((linha = br.readLine())!=null) {
				array = linha.split(",");
				
				lista.add(new Familia());
				lista.get(lista.size() - 1).setIdade(new Integer(array[0]));
				lista.get(lista.size() - 1).setNome(array[1]);
				lista.get(lista.size() - 1).setSobreNome(array[2]);
				
				System.out.println("Lendo " + linha + "... aguarde");
			}
			
			return lista;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
