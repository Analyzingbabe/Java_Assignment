

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mysqlpgm.DAOException;

public class EcommApp {

	public static  void main(String[] args) {
		List<Shoping_Point> ProductList=new ArrayList<>();
		 
		
		IProductDAO g=new ProductDAO();  // DAO object creation
	
	/*	Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the number of Products to add");
		int numOfproducts=scan1.nextInt();
		for (int i = 0; i < numOfproducts; i++) {
			
			System.out.println("Enter product Id");
			int  Pro_id=scan1.nextInt();
			System.out.println("Enter product Name");
			String Pro_name=scan1.next();
			System.out.println("Enter product price");
			double Pro_price=scan1.nextDouble();
			System.out.println("Enter quantity");
			int  Pro_count=scan1.nextInt();
			
				
			Shoping_Point productlist1=new Shoping_Point(Pro_id,Pro_name,Pro_price,Pro_count);  //injecting the data to the bean
			ProductList.add(productlist1);
			
		scan1.close();
			try {
				int pl =g.addproducts(ProductList);
				System.out.println("Successs & the number of products inserted:" +pl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		
			}*/
			//System.out.println("********The search result are*******");
	System.out.println();
	IProductDAO list1Dao= new ProductDAO();
	
	try {List<Shoping_Point> pList1 = list1Dao.ProList();
		
		pList1.forEach((Product1)->System.out.println(Product1.getPro_id()+"\t"+Product1.getPro_name()+"\t"+Product1.getPro_price()+"\t"+Product1.getPro_count()));
		
		double sum =pList1.stream().collect(Collectors.summingDouble((Product1->Product1.getPro_price()*Product1.getPro_count())));
		System.out.println("Sum of Prices:"+sum);
		System.out.println("Delete row from data base by id");
		List<Shoping_Point> pList2 = list1Dao.ProList();
			
					g.deleteProductById(116);
					System.out.println("Sort product proid");
					g.sortbyid();
					System.out.println("update row from data base by id");
					g.updateProductById();
					System.out.println("updated product price");
	}
			 catch (DAOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	 }}
	
	
	
	
	
		

			
	
		
		
	

