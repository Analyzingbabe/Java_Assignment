



import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.mysqlpgm.DAOException;
import com.mysqlpgm.Employee;







public class DBApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		List<Shoping_Point> ProductList=new ArrayList<Shoping_Point>();
		
		IProductDAO list1Dao= new ProductDAO();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Products to add");
		int numOfproducts=scan.nextInt();
		
		for (int i = 0; i < numOfproducts; i++) {
			System.out.println("Enter Product Id");
			int Pro_id=scan.nextInt();
			System.out.println("Enter Product Name");
			String Pro_name=scan.next();
			System.out.println("Enter Product Price");
			double Pro_price=scan.nextDouble();
			System.out.println("Enter Quantity");
			int Pro_count=scan.nextInt();
			
			Shoping_Point pro=new Shoping_Point(Pro_id,Pro_name, Pro_price, Pro_count);
			ProductList.add(pro);
			System.out.print("\n"+Pro_id);
			System.out.print("\n"+Pro_name);
			System.out.print("\n"+Pro_price);
			System.out.print("\n"+Pro_count);
		}
		scan.close();
		
	
					try {
						int count1 =list1Dao.addproducts(ProductList);
						System.out.println("\n"+"Successs and the number of products inserted:" +count1);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		
	
		
		System.out.println("********The Products List*******");
		List<Shoping_Point> pList;
		try {
			pList = list1Dao.ProList();
			pList.stream().sorted();
			pList.forEach((Product1)->System.out.println(Product1.getPro_id()+"\t"+Product1.getPro_name()+"\t"+Product1.getPro_price()+"\t"+Product1.getPro_count()));
			double sum =pList.stream().collect(Collectors.summingDouble(Product1->Product1.getPro_price()*Product1.getPro_count()));
			System.out.println("Sum of Prices:"+sum);
			double avgPrice = pList .stream().collect(Collectors.averagingDouble(Shoping_Point->Shoping_Point.getPro_price()));
			System.out.println("Average Price:"+avgPrice);
			Shoping_Point Shoping_Point = pList.stream().max((pro1,pro2)->pro1.getPro_price()>pro2.getPro_price()?1:-1).get();
			System.out.println("Max price:"+Shoping_Point.getPro_price());
			Shoping_Point Shoping_Point1 = pList.stream().min((pro1,pro2)->pro1.getPro_price()>pro2.getPro_price()?1:-1).get();
			
			System.out.println("min price:"+Shoping_Point1.getPro_price());
			System.out.println("Sort product by product Price");
			list1Dao.sortbyPrice();
			//System.out.println("update row from data base by id");
			
			
			// pList.forEach((Product1)->System.out.println(Product1.getPro_id()+"\t"+Product1.getPro_name()+"\t"+Product1.getPro_price()+"\t"+Product1.getPro_count()));
			
			
			}
			catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				

		//System.out.println("Min salary:"+emp.getSalar		Employee emp = employeeList.stream().min((employee1,employee2)->employee1.getSalary()>employee2.getSalary()?1:-1).get();y());
		
		
	
	
	}
}
