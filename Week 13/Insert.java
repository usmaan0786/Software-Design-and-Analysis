package jdbc;
import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dburl= "jdbc:mysql://localhost:3306/myschool";
		String user= "root";
		String pass= "";
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dburl, user , pass);
			
			System.out.println("Database connection successful!\n");
			
			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			System.out.println("Inserting a new employee to database\n");
			
			int rowsAffected = myStmt.executeUpdate(
				"insert into student" +  "(id, name, age,address)" +
				"values" +  "(3, 'Muqsit', 21,'Peshawar')");
			System.out.println(rowsAffected + "rows affected");
			//===================================================================
			myRs = myStmt.executeQuery("select * from student");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("name") + ", " + myRs.getString("age") + ", " + myRs.getString("address"));
			}
			
			// 5. Close Connection
			myConn.close();
		}
		catch (Exception sqlEx) {
			System.out.println(sqlEx);
			
		}
	}
	//******************************************
}
