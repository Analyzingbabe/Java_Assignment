
import java.beans.Statement;
import java.util.Random;

public class SBI implements BankWithTheServices {
	
	

	@Override
	public int createAccount(String name, String ID_type, String ID) {
		// TODO Auto-generated method stub
		Random random=new Random();
		return random.nextInt(1000);
	}

	@Override
	public int creditAmount(int accNumber, int balance) {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public int debitAmount(int accNumber, int balance) {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double transferAmount(int fromaccNumber, int toaccNumber, double balance) {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public Statement1[] ministatement(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}