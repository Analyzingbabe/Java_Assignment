





import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DAOimplementation {
	
	

public int addProduct(List<Shoping_Point> ProductList) throws DAOException {
	Connection connection = DButil.getDBConnection();  //Step 1&2
	int nofRecInserted=0;
	try {
		//Step3
		PreparedStatement pStatement = connection.prepareStatement("insert into Shoping_Point(Pro_id,Pro_name,Pro_price,Pro_count) values(?,?,?,?)");
		for (Shoping_Point product : ProductList) {
			pStatement.setInt(1, product.getPro_id());
			pStatement.setString(2, product.getPro_name());
			pStatement.setDouble(3,product.getPro_price());
			pStatement.setInt(4, product.getPro_count());
			nofRecInserted+=pStatement.executeUpdate();   //Step4       a+=b  <=>  a=a+b
		}
		connection.close();  //Step5
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return nofRecInserted;
}
}

	