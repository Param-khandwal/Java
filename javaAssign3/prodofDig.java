import java.util.Scanner;
class prodofDig{

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int origNum,n,rem,prod=1;
			System.out.println("Enter any num ");
			n=s.nextInt();

			origNum=n;
			while(n>0){
				rem=n%10;
				prod=rem*prod;
				n=n/10;
			}
			System.out.println("product of digit "+origNum+" is "+prod);



	}
}