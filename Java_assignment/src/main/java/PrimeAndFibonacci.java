


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PrimeAndFibonacci {
	
			int no;
			private ArrayList list = new ArrayList();

			ArrayList generateSeries(int num) {
				int f1, f2 = 0, f3 = 1;
				for (int i = 1; i <= num; i++) {
					list.add(f3);
					f1 = f2;
					f2 = f3;
					f3 = f1 + f2;
				}
				return list;
			}

			static boolean isPrime(int number) {
				boolean isPrime = false;
				int i = (int) Math.ceil(Math.sqrt(number));
				while (i > 1) {
					if ((number != i) && (number % i == 0)) {
						isPrime = false;
						break;
					} else if (!isPrime)
						isPrime = true;
					--i;
				}
				return isPrime;
			}

			public static void main(String[] args) {
				
				Scanner scan=new Scanner (System.in);
				System.out.println("Enter no of fibanocci's to be  generated");
				int n=scan.nextInt();
				ArrayList fibb = new ArrayList();
				PrimeAndFibonacci pf = new PrimeAndFibonacci();
				fibb = pf.generateSeries(n);
				Iterator iter = fibb.iterator();
				while (iter.hasNext()) {
					int reqNo = (int) iter.next();
					if (isPrime(reqNo))
						System.out.println(" "+reqNo);
				}System.out.println("Generated fibanocci's are prime");
			}
		
	}

