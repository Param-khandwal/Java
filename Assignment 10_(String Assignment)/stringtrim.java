// 12.Write a Java program to trim any leading or trailing whitespace from a given string.

//  Sample Output:
// Original String: Java Exercises
// New String: Java Exercises

public class stringtrim{
	public static void main(String[] args) {
		String str1="          Java Exercises";

		String str2=str1.trim();
		System.out.println(str2);

	}
}