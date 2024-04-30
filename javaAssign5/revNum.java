import java.util.Scanner;
public class revNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,rem,c,origNum,sum=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		

		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;

		}
		System.out.println(" "+ sum);

	}


}