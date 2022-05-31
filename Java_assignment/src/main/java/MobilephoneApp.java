import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class MobilephoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String, Integer> Mobile_number_book = new HashMap <String,Integer>();
 Mobile_number_book.put("Meen",983456783);
 Mobile_number_book.put("Lana", 984021239);
 Mobile_number_book.put("sara", 984031234);
 Mobile_number_book.put("mara", 984001234);
 Mobile_number_book.put("sana", 984081234);
 Mobile_number_book.put("veena", 984111234);
 Mobile_number_book.put("Ginger", 984131234);
 Mobile_number_book.put("Bala", 974031234);
 Mobile_number_book.put("Dhaksid", 964031234);
 
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter the name");
 String name=scan.nextLine();
 
 if( Mobile_number_book.containsKey(name)) {
	 Integer a= Mobile_number_book.get(name);
	 System.out.println(name+"="+a);
	
	
	
 }
	}

}
