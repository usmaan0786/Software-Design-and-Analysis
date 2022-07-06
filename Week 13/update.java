package jdbc;
import java.sql.*;

public class update {

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
			System.out.println("Updating an Employee...\n");
			
			int rowsAffected = myStmt.executeUpdate(
					"update student " +
					"set address='Lahore' " + 
					"where name='Ahmad'");
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
	//***************************************************
}
