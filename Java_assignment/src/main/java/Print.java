


	import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;

	  public class Print implements Bill_Pay_App {
		  public double calcBill(int units) {
				System.out.println("Select Any Option");
				System.out.println("1.Pay_Electricity bill");
				System.out.println("2.Pay_water Bill");
				Scanner  scan = new Scanner(System.in);
				int a=scan.nextInt();
				switch(a) {
				case 1:
				{
					Print pb=new Power_BILL();
					int bill=Power_BILL.calc(units);
					return bill;
					}


				case 2:
					{
						Print wb=new Water_BILL();
						int bill=Water_BILL.calc(units);
						return bill;
					}
				}
				return units;
			}
		  public void printtBill(double Amount) {
					System.out.print("######### BILL STATEMENT ########");
					ArrayList personal_info = new ArrayList();
					Scanner sc=new Scanner(System.in);  
					System.out.print("Enter your name");  
					String str= sc.nextLine();  
				    // Add elements to ArrayList
					personal_info.add(str);
					
					Scanner sc1=new Scanner(System.in);  
					System.out.print("Enter your Door Number");  
					int Door_No= sc1.nextInt();  
					personal_info.add(Door_No);
					
					Scanner sc2=new Scanner(System.in);  
					System.out.print("Enter your Full address");  
					String str1= sc2.nextLine();  
					personal_info.add(str1);
					
					Scanner sc3=new Scanner(System.in);  
					System.out.print("Enter Meter Number");  
					int meter_no= sc3.nextInt();
					personal_info.add(meter_no); 
					
					Scanner sc4=new Scanner(System.in);
					System.out.print("Enter your credit card bank name");  
					String str2= sc4.nextLine();
					personal_info.add(str2); 
					
					Scanner sc5=new Scanner(System.in);
					System.out.print("Enter your creditcard Number");  
					int Acc_no= sc5.nextInt();
					personal_info.add(Acc_no);
					
					Scanner sc6=new Scanner(System.in);
					System.out.print("Enter your pin");  
					int pin= sc6.nextInt();
					personal_info.add(pin);
					
					Random random=new Random();
					int Bill_no= random.nextInt(10000);
					System.out.print("Bill No: "+Bill_no);
					personal_info.add(Bill_no);
					
					System.out.println(" \n"+str+" Bill : " + personal_info);
					System.out.println("Amount Paid:=$"+Amount );
					return ;
				}


		@Override
		public  String user(){
			// TODO Auto-generated method stub
			
			System.out.println("Select any option");
			System.out.println("1.Sign_up");
			System.out.println("2.Sign_in");
			Scanner  s8 = new Scanner(System.in);
			int select=s8.nextInt();
			ArrayList Newuser1=new ArrayList();
			{ArrayList Login1=new ArrayList();
			switch(select) {
			case 1:
			{
			
			Scanner  s1 = new Scanner(System.in);
			System.out.println("user name");
			String str= s1.nextLine(); 
			Newuser1.add(str);
			Scanner  s2 = new Scanner(System.in);
			System.out.println("password");
			String str1= s2.nextLine(); 
			Newuser1.add(str1);
			Scanner  s3= new Scanner(System.in);
			System.out.println("confirm password");
			String str2= s2.nextLine(); 
			Newuser1.add(str2);
			if(str2.equals(str1)) {
			System.out.println(str +" Sucessfully Signed_up");}
			else
				System.out.println("Password not correct");
			}
			case 2:
				System.out.println("Sign_in");
			Scanner  s4 = new Scanner(System.in);
			System.out.println("user name");
			String str3= s4.nextLine(); 
			Login1.add(str3);
			Scanner  s5 = new Scanner(System.in);
			System.out.println("password");
			String str4= s5.nextLine(); 
			Login1.add(str4);
		
			if(Newuser1.contains(str3) && Newuser1.contains(str4)) {
			System.out.println(str3+" Sucessfully Signed_in");}
			else
				System.out.println("User name not exits");
			}
			
			}
		
			return ("Welcome ");
		
			
		}


	}
