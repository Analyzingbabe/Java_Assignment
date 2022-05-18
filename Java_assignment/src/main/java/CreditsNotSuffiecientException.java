

import java.util.Scanner;


public class CreditsNotSuffiecientException {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter credits");
		
			if(scanner.nextInt()<50) {
				throw  new CreditNotSuffiecientException();
			}else 
			{
				System.out.println("Welcome to the credit section");
			}
			scanner.close();
		}


	
	static class CreditNotSuffiecientException extends RuntimeException{
		
		public CreditNotSuffiecientException() {
			System.out.println("Insuffiecient credit amount ");
			try {
				
				CreditNotSuffiecientException.division(1,0);
				
			}catch (ArithmeticException result) {
				System.out.println("credit should not be less than 50");
			}	
			finally {
				System.out.println("Thanks you, welcome again");
			}
			System.out.println("bye");
		}

		private static int division(int i,int j) throws ArithmeticException {
			// TODO Auto-generated method stub
			int result=0;
			result=i/j;
			return result;
		} 
		
	}
	
	
		}
		