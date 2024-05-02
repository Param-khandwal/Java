// 6.. Write a Java program to concatenate a given string to the end of
// another string. 

// Sample Output:
// String 1: java Exercises and
// String 2: Python Exercises
// The concatenated string: java Exercises and Python Exercises


public class stringConcat{
	public static void main(String[] args) {
		String str1="Java Excersices";
		String str2="Python Excersices";

		System.out.println(str1+" "+str2);
		System.out.println(str1.concat(" ").concat(str2));
	}
}