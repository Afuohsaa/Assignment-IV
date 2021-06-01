import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
//to test all numbers from 2 to n-1
		int t=n-2; //since n is should be greater than 1 and less than itself!!!
		int x=3; // with primality test, first we check if a number is divided by 2 or 3 then by the other numbers less than root(n)
		int i;
		int c;
		boolean isPrime=false;
		if (n<1) 
			System.out.println("Number must be greater than 1");	

		for ( i = 2; i <= n/2; i++) {
			 c =  n/i;
				      if (n % i == 0 && c==Math.ceil(c)) {
				        isPrime = true;
				        System.out.println(n+" is a composite number and the factors are "+c);
				      }
				    }

			if (!isPrime)
			System.out.println(n + " is a prime number and the factors are 1 and "+n);
			else
			
			System.out.println("With 1st method number of iteration  is: "+t
					+"\nWith 2nd method number of iteration  is: "+x);
		
		}
		
	}
	



