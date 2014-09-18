package org.ocpjp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.ocpjp.ConexaoFactory;
import org.ocpjp.model.Familia;

//  con.setAutoCommit(false);  con.commit(); con.rollback();
public class FamiliaDao {
	PreparedStatement stmt;

	public List<Familia> obter() throws SQLException {
		Connection con = new ConexaoFactory().getConnection();
		String sql = "Select * from ocpjp.familia";
		PreparedStatement stmt = con.prepareStatement(sql); // Exception se colocar insert(DML) e executar executeQuery 
		List<Familia> lista = new ArrayList<>();
		
		// myrs.setCommand("Select * from ocpjp.familia");
		// rowSet.execute();
		try {
			ResultSet rs = stmt.executeQuery(); // se 

			while (rs.next()) {
				lista.add(new Familia());
				lista.get(lista.size() - 1).setIdade(rs.getInt("idade"));
				lista.get(lista.size() - 1).setNome(rs.getString("nome"));
				lista.get(lista.size() - 1).setSobreNome(
						rs.getString("sobrenome"));
			}
			// rs.absolute(2);	System.out.println(rs.getString(3)); // move o cursor para Suely
			return lista;

		} finally {
			stmt.close();
			con.close();
		}
	}

	public void inserir(List<Familia> lista) throws SQLException {
		String sql = "insert into familia (idade, nome, sobrenome) values (?,?,?)";
		Connection con = new ConexaoFactory().getConnection();
		stmt = con.prepareStatement(sql);

		try {
			for (Familia familia : lista) {
				stmt.setInt(1, familia.getIdade());
				stmt.setString(2, familia.getNome());
				stmt.setString(3, familia.getSobreNome());

				stmt.execute();
			}

			System.out.println("Gravado!");
		} finally {
			stmt.close();
			con.close();
		}
	}

	public void deletarTodos() throws SQLException {
		String sql = "delete from ocpjp.familia";
		Connection con = new ConexaoFactory().getConnection();
		stmt = con.prepareStatement(sql);
		try{
			stmt.execute();
		} finally {
			stmt.close();
			con.close();
		}
	}

}
