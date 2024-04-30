
import java.util.Scanner;
class sum{
	public static void main(String[] args) {
		
		int n,sum;

		System.out.println("enter the number you want to sum");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		sum=(n*(n+1))/2;

		System.out.println("Sum ="+sum);
	}
}