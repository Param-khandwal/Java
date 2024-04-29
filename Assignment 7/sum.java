// 2. Write a program to read two numbers from the console, find their sum and 
// display the numbers and the sum on the console. 

import java.util.Scanner;
class sum{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int a,b,sum;

		System.out.println("enter the first number");
		a=sc.nextInt();

		System.out.println("enter the second number");
		b=sc.nextInt();

		sum=a+b;

		System.out.println("Sum :"+sum);



	}
}