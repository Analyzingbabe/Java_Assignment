

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mysql.cj.protocol.Resultset;
import com.mysqlpgm.DAOException;
import com.mysqlpgm.Employee;





public class ProductDAO implements IProductDAO {
	List<Shoping_Point> productlist=new ArrayList<>();
	List<Shoping_Point> productlist1=new ArrayList<>();
	
	@Override
	public List<Shoping_Point> ProList() throws DAOException {
	
		// TODO Auto-generated method stub
		Connection connection = DButil.getDBConnection();  //taking the connection
		
		try {
			//step3: Create the Statement object used to send SQL queries to DB
			Statement statement = connection.createStatement();
			
			//step4: execute the SQL queries
			ResultSet resultSet = statement.executeQuery("select Pro_id, Pro_name,Pro_price,Pro_count from Shoping_Point");//code sql query
			while (resultSet.next()) {  //retrieving data and setting them into product and adding to List
				int data = resultSet.getInt(1);
				  System.out.println("Fetching data by column index for row " + resultSet.getRow() + " : " + data);
				Shoping_Point p1=new Shoping_Point(resultSet.getInt("Pro_id"),resultSet.getString("Pro_name"), resultSet.getDouble("Pro_price"), resultSet.getInt("Pro_count"));
				productlist.add(p1);
			}
			connection.close();  //step5
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return productlist;
	}



 
	@Override
	public Shoping_Point Addproduct(Shoping_Point Addpro) throws DAOException {
		boolean check=productlist.add(Addpro);
		if(!check) {
			Addpro=null;
			System.out.println("failed to add");
		}  
		return Addpro;
	
	}


	@Override
	public int addproducts(List<Shoping_Point> ProductList) {
		// TODO Auto-generated method stub
		
		Connection connection = DButil.getDBConnection();  //Step 1&2
		int nofRecInserted=0;
		try {
			//Step3
			PreparedStatement pStatement = connection.prepareStatement("insert into Shoping_Point(Pro_id,Pro_name,Pro_price,Pro_count) values(?,?,?,?)");
			for (Shoping_Point product1 : ProductList) {
				pStatement.setInt(1, product1.getPro_id());
				pStatement.setString(2, product1.getPro_name());
				pStatement.setDouble(3,product1.getPro_price());
				pStatement.setInt(4, product1.getPro_count());
				nofRecInserted+=pStatement.executeUpdate();   //Step4       a+=b  <=>  a=a+b
			}
			connection.close();  //Step5
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nofRecInserted;
	}

	
	@Override
	public
	List<Shoping_Point> findproducts(int Productid) {
	Connection connection = DButil.getDBConnection();  //taking the connection
		
		try {
			//step3: Create the Statement object used to send SQL queries to DB
			Statement statement = connection.createStatement();
		for (Shoping_Point Shoping_Point: productlist) {
			System.out.println("count");
			if(Shoping_Point.getPro_id()==Productid) {
				ResultSet resultSet = statement.executeQuery("select Pro_id, Pro_name,Pro_price,Pro_count from Shoping_Point");//code sql query
				while (resultSet.next()) {  //retrieving data and setting them into product and adding to List
					int data = resultSet.getInt(1);
					  System.out.println("Fetching data by column index for row " + resultSet.getRow() + " : " + data);
					Shoping_Point p1=new Shoping_Point(resultSet.getInt("Pro_id"),resultSet.getString("Pro_name"), resultSet.getDouble("Pro_price"), resultSet.getInt("Pro_count"));
					productlist.add(p1);
				}}}
				connection.close();  //step5
		}
			catch (SQLException e) {
				// TODO: handle exceptionrintStackTrace();
			}
		
			return productlist1;
		}
		
	




	@Override
	public void updateProductById() throws DAOException {
		// TODO Auto-generated method stub
		Connection connection = DButil.getDBConnection(); 
		try {Statement statement = connection.createStatement();
		//final String QUERY = "SELECT Pro_id,Pro_name,Pro_price, Pro_count FROM Shoping_Point";
		//String rs1= "UPDATE Shoping_Point SET Pro_price='Proprice' WHERE Pro_id= 'Proid'";
		//statement.executeUpdate(rs1); 
		int sql=statement .executeUpdate("UPDATE Shoping_Point SET Pro_price =10.0  WHERE Pro_id  =101");
		   
		 System.out.print(sql);
		 connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sql = "SELECT * FROM department INNER JOIN employee ON department.depno=employee.depno  ";
		//UPDATE SAVINGS SET BALANCE = ? WHERE ACCOUNTNUMBER = ?
		
	}
	@Override
	public void sortbyid()throws DAOException{
		Connection connection = DButil.getDBConnection(); 
		try {Statement statement = connection.createStatement();
		String query = "Select * from Shoping_Point ORDER BY Pro_id ASC";
		ResultSet rs = statement.executeQuery(query); 
        System.out.println("Id    Name    Price		count");
        while (rs.next()) {
            int id = rs.getInt("Pro_id");
            String name = rs.getString("Pro_name");
           double Price = rs.getDouble("pro_price");
           int count = rs.getInt("Pro_count");
            System.out.println(id + "  " + name + "   "
                               + Price+" 	"+count+"		");
        }
    
        // close the connection
        connection.close();
		 
		// Shoping_Point p1=new Shoping_Point(rs.getInt("Pro_id"),rs.getString("Pro_name"), rs.getDouble("Pro_price"), rs.getInt("Pro_count")); 
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	}
	@Override
	public void deleteProductById(int proId) throws DAOException {
		// TODO Auto-generated method stub
		Connection connection = DButil.getDBConnection();  //Step 1&2
		int nofRecInserted=0;
		
			//Step3
			//String sql = "DELETE FROM warehouses WHERE id = ?";
		try {	PreparedStatement st = connection.prepareStatement("DELETE FROM  Shoping_Point WHERE  Pro_id=?");
				st.setInt(1, proId);
				
				st.executeUpdate();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	            // set the corresponding param
	            
	            		 
	        }

	          
	       
		
		
	




	
	




	@Override
	public void addproductWithMap(String proName, Shoping_Point shoping_Point) throws DAOException {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Map<String, Shoping_Point> getproductWithMap() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void sortbyPrice() throws DAOException {
		// TODO Auto-generated method stub
		Connection connection = DButil.getDBConnection(); 
		try {Statement statement = connection.createStatement();
		String query = "Select * from Shoping_Point ORDER BY Pro_price ASC";
		ResultSet rs = statement.executeQuery(query); 
        System.out.println("Id    Name    Price		count");
        while (rs.next()) {
            int id = rs.getInt("Pro_id");
            String name = rs.getString("Pro_name");
           double Price = rs.getDouble("pro_price");
           int count = rs.getInt("Pro_count");
            System.out.println(id + "  " + name + "   "
                               + Price+" 	"+count+"		");
        }
    
        // close the connection
        connection.close();
		 
		// Shoping_Point p1=new Shoping_Point(rs.getInt("Pro_id"),rs.getString("Pro_name"), rs.getDouble("Pro_price"), rs.getInt("Pro_count")); 
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 	
	}

	}




	

	
	




	


	
			
			
		 
		
			
		
	



	
	



	
	
	