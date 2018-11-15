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
		int rowsAffected;
		try {
			//getconnection takes in 3 argument, the url, username and password of the connection we are attempting to connect to.
			//establish connection object
			Connection conn = DriverManager.getConnection(url, "root", "????????");
			
			//create a statement object to sent to the database
			Statement statement = conn.createStatement();
			
			
			//rowsAffected = statement.executeUpdate("INSERT INTO employees_tbl(id, name, dept, salary)values(1001,'Dark','CIO',10000);");
			//deletes all data
			//rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl");
			//updates data
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl\n" + 
					"SET salary = 50000\n" + 
					"WHERE name = 'John';");
			
			//execute statement object//cannot use this to manipulate data set.
			//exclusively to query data from the desired db
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");
			
			//to insert to the table, we must use executeUpdate.
			
			
			int salaryTotal = 0;
			//process result
			while(resultSet.next()) {
				//gets number from salary column
				salaryTotal += resultSet.getInt("salary");
				//getting department column
				//getting name colum
				//you could also do getInt if you want to get a column that is made up of integers.
				System.out.println(resultSet.getString("dept"));
			}
			System.out.println(salaryTotal);
			System.out.println("Rows Affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
