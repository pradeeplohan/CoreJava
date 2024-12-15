import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count =0;
		if(n<=1) 
		{
			System.out.println(n+" is not a prime number.");
			return;
		}
		for(int j =1; j <= n/2; j++) 
		{
			if(n%j==0) 
			{
				count++;
			}
			
		}
		if(count>1) {
			System.out.println("This is not a prime number");
		}
		else
			System.out.println("prime number "+n);

	}

}
