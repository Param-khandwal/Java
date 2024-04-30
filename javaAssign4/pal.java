import java.util.Scanner;
class pal{

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int origNum,n,rem,sum=0;
			System.out.println("Enter any num ");
			n=s.nextInt();

			origNum=n;
			while(n>0){
				rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			System.out.println("reverse of digit "+origNum+" is "+sum);

			if(origNum==sum){
				System.out.println("Plaindrome");
			}
			else{
				System.out.println("Not Palindrome");
			}

	}
}