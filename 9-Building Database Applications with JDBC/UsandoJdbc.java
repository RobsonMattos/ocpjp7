import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Item 3: Update and query a database..
// - Processing SQL Statements with JDBC
public class UsandoJdbc {

	public static void main(String[] args) {
		// obtem uma conexão
		try (Connection con = new Conectando().getConnection()){
			// Create a statement(statement não aceita parametro em runtime). Auto-Commit default
			Statement st = con.createStatement(); // o commit é realizado qdo o statement é finalizado
			ResultSet rs = st.executeQuery("select * from familia");
			print(rs);
	// ------------------------------------------------------------------------------------
			PreparedStatement pst = con.prepareStatement("select * from familia where idade = ?"); // CallableStatement
			pst.setInt(1, 46);
			rs = pst.executeQuery();
			print(rs);
		} catch (Exception e) {	e.printStackTrace(); }		
	}
	
	static void print(ResultSet rs) {
		try {
			while(rs.next())
				System.out.println(rs.getString(2));
		} catch (SQLException e) { e.printStackTrace(); }
	}

}
