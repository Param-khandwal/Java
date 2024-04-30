import java.util.Scanner;
class sumofDig{

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int origNum,n,rem,sum=0;
			System.out.println("Enter any num ");
			n=s.nextInt();

			origNum=n;
			while(n>0){
				rem=n%10;
				sum=rem+sum;
				n=n/10;
			}
			System.out.println("sum of digit "+origNum+" is "+sum);

	}
}