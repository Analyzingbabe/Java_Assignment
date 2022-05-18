
public class Statement1 {

	private  String transactionId;
	private String trnsactionDate;
	private int accountNumber;
	private double balanceamount;
	public String getTrnsactionDate() {
		return trnsactionDate;
	}
	public void setTrnsactionDate(String trnsactionDate) {
		this.trnsactionDate = trnsactionDate;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int getAccountNum() {
		return accountNumber;
	}
	public void setAccountNum(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return balanceamount;
	}
	public void setAmount(double balanceamount) {
		this.balanceamount = balanceamount;
	}
	public static  double getBalance(int accountNumber ) {
		// TODO Auto-generated method stub
		
		
		return 1000;
	}
	

}