package org.ocpjp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Patern factory poderia ser um singleton
// import jdbc pacotes, registra jdbc driver, formulate database url, chama getConnection
public class ConexaoFactory {
	
	private String nome = "root";
	private String sobreNome = "root";
	public String url = "jdbc:mysql://localhost:3306/ocpjp";
	public Connection con = null;
	
	// JdbcRowSet, CachedRowSet, WebRowSet, JoinRowSet, FilteredRowSet
	// JdbcRowSet myrs = null;
	// myrs.setUrl("jdbc:oracle:oci:@");
	// myrs.setUsername("SCOTT");
	// myrs.setPassword("TIGER");
	
	public Connection getConnection() {
		
		try {
			// Class.forName("com.mysql.jdbc.Driver"); // registra jdbc driver para carregar o driver
			return DriverManager.getConnection(url, nome, sobreNome);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null;
	}
	
}
