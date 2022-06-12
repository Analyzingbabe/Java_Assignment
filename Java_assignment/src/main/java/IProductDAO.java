

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.mysqlpgm.DAOException;
import com.mysqlpgm.Employee;






public interface IProductDAO {
	
		List<Shoping_Point> ProList() throws DAOException;
		
		Shoping_Point Addproduct(Shoping_Point Addpro)throws DAOException;
		
		int addproducts(List<Shoping_Point>ProductList)throws DAOException;


		List<Shoping_Point> findproducts(int Productid)throws DAOException;
		
		void sortbyid()throws DAOException;
		void sortbyPrice()throws DAOException;
		
		void updateProductById() throws DAOException;
		
		void deleteProductById(int proId) throws DAOException;
		
		void addproductWithMap(String proName, 	Shoping_Point shoping_Point) throws DAOException;
		
		Map<String, 	Shoping_Point> getproductWithMap() throws DAOException;




		
	}


