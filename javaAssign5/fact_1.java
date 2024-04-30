//factorial of 1 to 10

import java.util.Scanner;
public class fact_1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int n,fact=1;
				// System.out.println("Enter any Number");
				// n=sc.nextInt();

			for(int i=1;i<=10;i++){
				fact=fact*i;
				
				System.out.println( "fact of a number "+i+" is "+fact);
			}
		
		}
	}