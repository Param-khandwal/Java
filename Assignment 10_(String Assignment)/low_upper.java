// 4.Write a Java program to convert all the characters in a string to
// lowercase

import java.util.Scanner;
public class low_upper{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter string of your choice");
		String str1=sc.nextLine();
		System.out.println("Original String: "+str1);

		String str2=str1.toLowerCase();
		System.out.println("New String :"+str2);
	}
}