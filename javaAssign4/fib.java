import java.util.Scanner;
class fib{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,sum=0;
		System.out.println("Enter the number");
		n=sc.nextInt();


		for(int i=0;i<=n;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println("sum"+sum);

	}
}