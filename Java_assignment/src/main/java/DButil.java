
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;



	public class DButil {
		static Connection getDBConnection() {
			Connection connection=null;
			if(connection==null) {
				try {
					//step1 : Register the driver
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					
					//step2: Get the connection (by supplying URL, username, password as parameters to getConnection()
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maymap2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "meena123");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return connection;
		}
	}

	