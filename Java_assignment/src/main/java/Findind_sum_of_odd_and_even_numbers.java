
import java.util.Arrays;
import java.util.Scanner;
public class Findind_sum_of_odd_and_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		
				int sum=0;
				int sum1=0;
				
				 Scanner number=new Scanner(System.in);
		  	  System.out.println("Enter the no.of elements in the array :");
		  	  int n=number.nextInt();
		  	  int []arr1=new int[n];
		  //	System.out.println("Enter the no.of elements in the array :");
		  	  System.out.println("Enter the elements of the array:");
		  	  
		  	  for(int i=0;i<n;i++) {
		  		  arr1[i]=number .nextInt();
		  		if (arr1[i]%2==0) {
		  			sum=sum+arr1[i];
		  			
		  		}
		  		else if (arr1[i]%2!=0) {
		  			sum1=sum1+arr1[i];
		  			
		  		
		  		}
		  	  
		  	  }
		  	  System.out.println("The Array elements are"+Arrays.toString(arr1));
			
		      //for(int g: arr1) {
		    	  
		    	//  System.out.println(g);
		    //  }
			
			
		      
				
			System.out.println("Sum of even numbers is :=" + sum);
			
			System.out.println("Sum of odd number is:="+sum1);
			}

		}
	
