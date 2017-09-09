import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) throws Exception{
		//1 . Collect the DB Information
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/tcidb";
		String username="root";
		String password="root";
		
		//2. Register the Driver
		Class c=Class.forName(driverClassName);
		System.out.println(c);
		
		//3. Getting Connection Object
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println(con);
		
		//4. Create Statement
		Statement stmt=con.createStatement();
		System.out.println(stmt);
		//5. Create SQL and execute statement
		String sql="insert into employee(name,salary) values('Deepak',5000)";
		stmt.execute(sql);
		
		System.out.println("Data Saved Successfully!");
		
		//6. close the statement and connection
		stmt.close();
		con.close();

	}

}
