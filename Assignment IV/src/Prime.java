import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();

		int t=n-2;

		if (n<1) 
			System.out.println("Number must be greater than 1");
		else if(n>=1){	
			for (int i = 2; i<n; i++) {

				double c= (double)n/i;

				if(n%i==0 && c==Math.ceil(c)) {
					System.out.println(n+" is a composite number and the factors are "+i);

				}
				
			}

				for (int j = 1; j<=n; j++) {

					double x= (double)n/j;

					if(n%j!=0 && x==Math.ceil(x)) {
						System.out.println(n+" is a prime number and the factors are "+j);


					}
				}
				System.out.println("\nWith 1st method number of iteration  is: "+t);
		}
		
	}
}

		

