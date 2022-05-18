import java.util.LinkedHashSet;
import java.util.Set;

public class Largest_Even_Number {
	
	


		
			

				static int MAX = 10;

				// Function to return the maximum
				// even number that can be formed
				// with any number of digit swaps
				static String getMaxEven(String str, int len)
				{
				//To store the max even number
					String maxEven="";
					// To store the frequencies of
					// all the digits
					int[] freq = new int[MAX];

					// To store the minimum even digit
					int i, minEvenDigit = MAX;
					for (i = 0; i < len; i++) {
						int digit = str.charAt(i) - '0';
						freq[digit]++;

						// If digit is even then update
						// the minimum even digit
						if (digit % 2 == 0)
							minEvenDigit
								= Math.min(digit, minEvenDigit);

					}

					// If there is no even digit then
					// it is not possible to generate
					// an even number with swaps
					if (minEvenDigit == MAX)
						return "-1";

					// Decrease the frequency of the
					// minEvenDigit
					freq[minEvenDigit]--;
					

					i = MAX-1;

					// Take every digit starting from the maximum
					// in order to maximize the number
				while(i>=0)
				{
					// Take current digit number of times
						// it appeared in the original number
					if(freq[i]>0)
					{
						maxEven= maxEven+i;
						freq[i]--;
					}else
						i--;
						
					}

					// Append the minimum even digit
					// in the end to make the number even
					maxEven= maxEven+minEvenDigit;

					return maxEven;
				}

				// Driver code
				public static void main(String[] args)
				{
					String str1=new String("d%#2373#@");
				String str = str1.replaceAll("[a-zA-Z%#@]", "");
				System.out.println("Eliminating charecters and special charecters :"+str);
				
					
					int len = str.length();

					// Function call
					System.out.println("Largest even number ");
					System.out.println(getMaxEven(str, len));
					//Eliminate the duplicate eliminate in the string
					char[] chars = str.toCharArray();
					Set<Character> charSet = new LinkedHashSet<Character>();
					for (char c : chars) {
					    charSet.add(c);
					}
					
			 
					StringBuilder sb = new StringBuilder();
					for (Character character : charSet) {
					    sb.append(character);
					}
					
					System.out.println("Eliminate the duplicate element from the string: "+sb.toString());
					
					 
			        // conversion from String object to StringBuffer
			        
			        // To reverse the string
			        sb.reverse();
			        System.out.println("Largest even number from the given string: "+sb);
					 
			        
					
				}
			

		}


