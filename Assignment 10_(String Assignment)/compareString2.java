// 8.Write a Java program to compare a given string to another string, ignoring case considerations.
//  Sample Output:
//  "Stephen Edwin King" equals "Walter Winchell"? false

// "Stephen Edwin King" equals "stephen edwin king"? true
//convert 1st string into lowercase then compare.

public class compareString2{
	public static void main(String[] args) {
		String str1= "Stephen Edwin King";
		String str2= "Walter Winchell";
		String str3= "stephen edwin king";

		System.out.println(str1.equals(str2));
		System.out.println(str1.toLowerCase().equals(str3));

	}
}
