// 13. Write a Java program to reverse words in a given string. 

import java.util.Scanner;
public class revString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want");
		String str1=sc.nextLine();

		int l=str1.length();
		// System.out.println(l);

		for(int i=l-1;i>=0;i--){
			System.out.print(str1.charAt(i)+"\n");
		}

	}
}