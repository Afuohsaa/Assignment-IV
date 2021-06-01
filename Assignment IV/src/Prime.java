import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();

		int t=n-2; //since n is should be greater than 1 and less than itself!!!
		int i;
		 int c;
		boolean flag=false;
		if (n<1) 
			System.out.println("Number must be greater than 1");	

		for ( i = 2; i <= n/2; i++) {
			 c =  n/i;
				      if (n % i == 0 && c==Math.ceil(c)) {
				        flag = true;
				        System.out.println(n+" is a composite number and the factors are "+c);
				      }
				    }

			if (!flag)
			System.out.println(n + " is a prime number and the factors are 1 and "+n);
			else
			//System.out.println(n+" is a composite number and the factors are ");
			System.out.println("\nWith 1st method number of iteration  is: "+t);
			
		}
		
	}
	



