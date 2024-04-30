 import java.util.Scanner;
public class gcd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,n=0;

		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();

		for(int i=1;i<=a && i<=b;i++){
			if(a%i==0 && b%i==0){
				n=i;
			}
		}
		System.out.println("GCD "+n);
	}
}