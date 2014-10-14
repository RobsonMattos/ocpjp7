import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Item 2: Connect to a database by using a JDBC driver.
// - Establishing a Connection
// - Connecting with DataSource Objects

public class Conectando {
	
	private String nome = "root";
	private String senha = "root";
	private String url = "jdbc:mysql://localhost:3306/ocpjp";
	private Connection con = null;
	
	public Connection getConnection() {
		try {
			con = DriverManager.getConnection(url, nome, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
		// Conexão com DataSource
//		Context ctx = new InitialContext();  
//		DataSource ds = (DataSource)ctx.lookup("jdbc/MeuDataSource");  
//		Connection conn = ds.getConnection();
		
	}
	
}
