// 10.Write a Java program to get the canonical representation of the stringobject. Sample Output:
// str1 == str2? false
// str1 == str3? true

// import java.util.Scanner;
// public class string10{
// 	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);

// 		System.out.println("Enter the string of your choice 1st");
// 		String str1=sc.nextLine();

// 		System.out.println("Enter the string of your choice 2nd");
// 		String str2=sc.nextLine();

// 		System.out.println("Enter the string of your choice 3rd");		
// 		String str3=sc.nextLine();



// 	}
// }

public class string10 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
