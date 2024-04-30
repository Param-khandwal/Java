import java.util.*;
import java.util.Scanner;
public class strPal{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string of your choice");
			String str = sc.next();
			String rev= "";
				int n=str.length()-1;
				
			for(int i=n;i>=0;i--){
				rev+=str.charAt(i);
			}
			System.out.println(rev);

			if (str.equals(rev)) {
				System.out.print("Palindrome");
			}
			else{
				System.out.println("not Palindrome");
			}
	}
}