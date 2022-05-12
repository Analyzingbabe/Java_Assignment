import java.util.Scanner;

public class Electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do
		{
			
		
	  		
			 int bill=0;
	  	
	      System.out.println("******Welcome to the Electricity Board*******");
	    	 System.out.println("Calculate your billing Amount");
	    	  Scanner get=new Scanner(System.in);
		      System.out.println("Please select the options:");
		      System.out.println("1.Previous Billing");
		      System.out.println("2.Current Billing");
		      int option=get.nextInt();
		      
	      
	  
	
	      switch(option) {
	         
	      case 1:
	    	  Scanner getprev=new Scanner(System.in);
	    	  System.out.println("Please enter your previous reading:");
	    	  int units=getprev.nextInt();
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
	    	  System.out.println("Your previous electricity bill amount is=$"+bill);
	    	  
	    	  break;
	      case 2:
	    	  Scanner getcurr=new Scanner(System.in);
	    	  System.out.println("Please enter your current reading:");
	    	  int unit=getcurr.nextInt();
	    	  if(unit<50 ) {
	    		  bill =unit*1;
	    		  
	    	       }
	    		  else if(unit>=50 && unit<100 ) {
	    			 bill=(((unit-50)*2)+(50*1));
	    			
	    		  }
	    		  else if(unit>=100 && unit<200) {
	    			  bill=((50*1)+(50*2)+((unit-100)*3));
	    		  }
	    		  else if(unit>200 && unit<400) {
	    			  bill=((50*1)+(50*2)+(100*3)+((unit-200)*4));
	    			  
	    		  }
	    		  else if (unit>400) {
	    			  bill=((50*1)+(50*2)+(100*3)+(200*4)+((unit-400)*5));
	    			
	    		  }
	    	  System.out.println("Your current electricity bill amount is=$"+bill);
	    	  break;
	      
	      
	    	  
	      
      
      
      
	      }
	
	
	      System.out.println("Do you want to continue?1.YES/2.NO:");
	  	Scanner n1=new Scanner(System.in);
	  	int sel=n1.nextInt();
	  	if(sel==2) {
	  		i=2;
	  		
	  	}
	  	else 
	  	{i=0;}
		}while(i==0);
		
	}

}
