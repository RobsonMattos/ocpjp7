import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// Item 5: Use the JDBC 4.1 RowSetProvider, RowSetFactory and RowSet interfaces.
// 	- Using RowSet Objects
// 	- Using JdbcRowSet Objects - sempre mantem conexão via JDBC Driver
public class EstudoRowSet {
	// CachedRowSetuso com thin-cliente | not appropriate for storing extremely large data set
		
	public static void main(String[] args) {
		Connection con = new Conectando().getConnection();
		try {
			Statement st = con.createStatement();
			// JdbcRowSet jdbcRowSet = new JdbcRowSetImpl(con); // pode passar Connection ou ResultSet
//            jdbcRowSet.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
//            String queryString = "SELECT * FROM student";
//            jdbcRowSet.setCommand(queryString);
//            jdbcRowSet.execute();
//            jdbcRowSet.addRowSetListener(new ExampleListener());
//
//            while (jdbcRowSet.next()) {
//                    // Generating cursor Moved event
//                    System.out.println("Roll No- " + jdbcRowSet.getString(1));
//                    System.out.println("name- " + jdbcRowSet.getString(2));
//            }
//            connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
