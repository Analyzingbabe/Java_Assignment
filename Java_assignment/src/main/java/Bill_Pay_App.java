
public interface Bill_Pay_App {
	
	
	public abstract String user();
	
	double calcBill(int units);


	void printtBill(double Amount);
	
	
	
public static void main(String[] arg) {
	double Amount;
	System.out.println("****** Welcome to the Bill paying APP *******");
	Bill_Pay_App Print= new Print();
	String p1=Print.user();
	Bill_Pay_App Print1= new Print();
	double cb=Print.calcBill(3000);
	Amount=cb;
	Bill_Pay_App Print2= new Print();
	Print.printtBill(Amount);
	 
}
}

