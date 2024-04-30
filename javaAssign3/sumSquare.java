import java.util.Scanner;

class sumSquare{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum;

		System.out.println("Enter the number of your choice");
		n=sc.nextInt();

		sum=(n*(n+1)*(2*n+1))/6;

		System.out.println("Sum of Square "+ sum);

		
	}
}