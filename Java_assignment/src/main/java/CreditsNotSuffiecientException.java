

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
			
			try {int a=0;
				if(a<50)
				{System.out.println("Insuffiecient credit amount ");}
				
				
				
			}catch (CreditNotSuffiecientException e) {
				
				System.out.println("credit should not be less than 50");
				e.printStackTrace();
			}	
			finally {
				System.out.println("Thanks you, welcome again");
			}
			System.out.println("bye");
		}

		
	}
	
	
		}
		