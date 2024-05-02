// 1. Write a Java program to get the length of a given string. Sample Output:
// The string length of 'example.com' is: 11


import java.util.Scanner;
public class stringLen{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the string of your choice");
		String str=sc.nextLine();

		int len=str.length();
		System.out.println("length of the string :"+len);
	}
}

