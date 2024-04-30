import java.util.Scanner;
class heron{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a,b,c;
		double s;

		System.out.println("Enter the side of a");
		a=sc.nextDouble();
		System.out.println("Enter the side of b");
		b=sc.nextDouble();
		System.out.println("Enter the side of c");
		c=sc.nextDouble();

		s=(a+b+c)/2;

		System.out.println("Semi perimeter"+s);

		a=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(a);


	}
}