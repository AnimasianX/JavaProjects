import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


// to make sure mysql works, we first have to copy the jar file connector to a lib file we create.
// after that, we go to the project using it and go to the properties and then to build path to libraries and add jar files.
//
public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to initialize the db we are going to use.
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			//getconnection takes in 3 argument, the url, username and password of the connection we are attempting to connect to.
			//establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "oopsie-daisy");
			
			//create a statement object to sent to the database
			Statement statement = conn.createStatement();
			
			//execute statement object
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");
			
			//process result
			while(resultSet.next()) {
				//getting department column
				//getting name colum
				//you could also do getInt if you want to get a column that is made up of integers.
				System.out.println(resultSet.getString("dept"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
