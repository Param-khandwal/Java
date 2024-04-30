//Write a program to check if a given number is divisible by both 5 and 11.

import java.util.Scanner;
class div{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number of your choice");
		int n=sc.nextInt();

		if(n%5==0 && n%11==0){
			System.out.println("Number is divisible by 5 and 11");
		}
		else{
			System.out.println("Number is not divisible by 5 and 11");
		}


	}
}
