

import java.util.ArrayList;
import java.util.Scanner;

public class SCM implements Student_Course{

	@Override
	public String addCourse() {
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
			System.out.println("User name not exits");}}
		return ("Welcome ");
}

	@Override
	public String viewCourse() {
		System.out.println("Select any option");
		System.out.println("1.Course1-Stem");
		System.out.println("2.Course2-Arts");
		Scanner  s7 = new Scanner(System.in);
		int sel=s7.nextInt();
		switch (sel) {
		
		case 1:
		{System.out.println("It has 3 subjects: English,Math,Science ");}
		break;
		case 2:
		{System.out.println("It has 3 Subjects: English,Math,Social_Science ");}
			
		break;
			
	}
		return null;}
	

	@Override
	public String addFee() {
		System.out.println("Select any option");
		System.out.println("1.Course1");
		System.out.println("2.Course2");
		Scanner  s5 = new Scanner(System.in);
		int sel=s5.nextInt();
		int Amount=0;
		switch (sel) {
		
		case 1:
		{System.out.println("Course1 fees is 1200");}
		break;
		case 2:
		{System.out.println("Course2 fees is 2000 ");}
			
			break;
			}

		System.out.println("Pay The Fees ");
		Scanner s6 = new Scanner(System.in);
		System.out.println("Enter the Fees amount ");
		int Fees=s6.nextInt();
		if (Fees>=1500) {
			System.out.println("10% discount ");
			 Amount=Fees-(Fees*10)/100;}
			else
				Amount=Fees;
		return (Amount+" paid Successfully." );
	}

	
}