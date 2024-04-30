import java.util.Scanner;
public class table{
		public static void main(String[] args) {
			Scanner sc =new Scanner (System.in);
			int n,prod;
			System.out.println("Please enter number of which table you want to print");
			n=sc.nextInt();

			System.out.println("Table of n is "+ n);
			for(int i=1;i<=10;i++){
				prod=n*i;
				System.out.println( n+"*"+i+"="+prod);
			}

		}
}