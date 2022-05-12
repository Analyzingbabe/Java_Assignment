import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner row1=new Scanner(System.in);
	  	  System.out.println("Enter the no of rows:");
	  	  int row=row1.nextInt();
	  	 // Scanner col1=new Scanner(System.in);
		 // System.out.println("Enter the no of coloumns:");
		 // int col=col1.nextInt();
	  	  int col;
			col=2*row;
				for (int i = 1; i <= row; i++)  
				{  
					
					for (int j = 1; j<= col - i; j++)   
					{   
						 
					for (int k = i; k >= 1; k--)  
					{  if(i==j) {
						System.out.print(k); 
						 
					}  }}
					for (int l = 2; l <= i; l++)   
					{  
						System.out.print(l);   
					}   
					System.out.println(); 
	}

}
