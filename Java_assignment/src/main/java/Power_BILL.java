
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Power_BILL extends Print {
	

	// TODO Auto-generated method stub
		
		
	static int calc(int units) {
			System.out.println("****** Welcome to the Electricity Board *******");
			System.out.println("Calculate your billing Amount");
			// TODO Auto-generated method stub
			
	 int bill=0;
	  if(units <50 ) {
    	  bill =units*1;
    	  
      }
    	  else if(units>=50 && units<100 ) {
    		 bill=(((units-50)*2)+(50*1));
    		 
    	  }
    	  else if(units>=100 && units<200) {
    		  bill=((50*1)+(50*2)+((units-100)*3));
    		  
    	  }
    	  else if(units>=200 && units<400) {
    		  bill=((50*1)+(50*2)+(100*3)+((units-200)*4));
    		 
    	  }
    	  else if (units>=400) {
    		  bill=((50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5));
    		  
    	  }
	  System.out.println("Your Electricity bill amount is=$"+bill);
		

	return bill;
	
}
}