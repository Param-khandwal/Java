// 7. Write a Java program to check whether a given string ends with the contents of another string. 

// Sample Output: 
// "Java Exercises" ends with "se"? false
// "Java Exercise" ends with "se"? true

public class endwithSttring{
	public static void main(String[] args) {
		String str1="Java Exercises";

		System.out.println(str1.endsWith("se"));  //false
		System.out.println(str1.endsWith("es"));  //true

	}
}