import java.util.Scanner;
class largeSamll{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,max;

		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		System.out.println("enter the value of c");
		c=sc.nextInt();


		int min=(a<b && a<c) ? a  : (b<a && b<c)?  b:c  ;
		 max=(a>b && a>c) ? a  : (b>a && b>c)?  b:c  ;

		System.out.println("largest value is "+max);
		System.out.println("minimum value is "+min);


	}
}