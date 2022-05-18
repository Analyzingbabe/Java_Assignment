import mydesign.Axis;
import mydesign.AxisChild;
import mydesign.BankWithTheServices;
import mydesign.SBI;
import mydesign.Statement1;

public interface BankWithTheServices {
	public static final double rateofinterest=14.09;
	public abstract int createAccount(String name, String ID_type, String ID);
	public abstract int creditAmount(int accNumber, int balance);
	public abstract int debitAmount(int accNumber, int balance);
	public abstract double transferAmount(int fromaccNumber, int toaccNumber, double balance);
	Statement1[] ministatement(int accountNumber);
	default int houseLoan() {
		System.out.println("house loan");
		return 0;
		}
	static void carloan() {
		System.out.println("car loan");
	}
	public static void main(String[] arg) {
	//SBI 
	BankWithTheServices Sbi=new SBI();
	int accountNumber=Sbi.createAccount("Tim", "DMV", "dmv1567");
	System.out.println("suucess and the account number generated is:"+accountNumber);
	Sbi.creditAmount(accountNumber, 1009);
	 int debitAmount=Sbi.debitAmount(100,1009); 
	 System.out.println("suucess and the amount credited is:"+debitAmount);
	 //Axis Bank
	 BankWithTheServices axis=new Axis();
	int accountNumber1=axis.createAccount("Dann", "DMV", "ddeo3456");
	System.out.println("suucess and the account number generated is:"+accountNumber1);
	axis.creditAmount(accountNumber, 100);
	int debitAmount1=axis.debitAmount(100,100); 
	System.out.println("suucess and the amount credited is:"+debitAmount1);
	double transferAmount=axis.transferAmount(86, 78, 500);
	System.out.println("suucessfully transfered the amount  is:"+transferAmount);
	BankWithTheServices achild=new AxisChild(); //polymorphism//latebinding
	
	int accountNumber2=achild.createAccount("saddiah", "adhar", "dsd1214");
	System.out.println("suucess and the account number generated is:"+accountNumber2);
	achild.creditAmount(accountNumber2, 2000);
	achild.ministatement(accountNumber2);
	System.out.println("Ministatement is successfully generated");
	int debitAmount2=achild.debitAmount(accountNumber2, 100);
	System.out.println("suucess and the amount credited is:"+debitAmount2);
	
}
}