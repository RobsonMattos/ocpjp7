import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

// Item 3: Update and query a database..
// - Processing SQL Statements with JDBC

public class UsandoJdbc {

	public static void main(String[] args) {
		// obtem uma conexão
		try (Connection con = new Conectando().getConnection()){
			// Create a statement. Auto-Commit default
			Statement st = con.createStatement(); // o commit é realizado qdo o statement é finalizado
			ResultSet rs = st.executeQuery("select * from familia");
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// Execute the query.
		// Process the ResultSet object.
		// Close the connection.
		

	}

}
