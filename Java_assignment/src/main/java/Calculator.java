import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		
		
		
		   
		do
		{
			
		
		Scanner num1 =new Scanner( System.in);
		System.out.println("Please enter the value of variable 'a'=");
		int s1=num1.nextInt();
		Scanner num2=new Scanner(System.in);
		System.out.println("Please enter the value of variable 'b'=");
		int s2=num2.nextInt();
		
			
	Scanner num3=new Scanner(System.in);
	System.out.println("Select any option");
	
	System.out.println("1.Add");
	System.out.println("2.Subtract");
	System.out.println("3.Multiply");
	System.out.println("4.Divide");
	int s3=num3.nextInt();
	switch(s3) {
	case 1:
		sum=s1 + s2;
		System.out.println("Addition of a & b:="+sum);
		break;
	case 2:
		sum=s1 - s2;
		System.out.println("Subtraction of a & b:="+sum);
		break;
	case 3:
		sum=s1 * s2;
		System.out.println("Multiplication of a & b:="+sum);
		break;
	case 4:
		sum=s1 / s2;
		System.out.println("Division of a & b:="+sum);
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
	
	
	
	}while (i==0);
	}

}
