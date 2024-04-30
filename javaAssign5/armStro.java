import java.util.Scanner;
public class armStro{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,rem,c,origNum,sum=0;
		System.out.println("Enter the number");
		n=sc.nextInt();

		origNum=n;
		while (n>0) {
			rem=n%10;
			c=(int)Math.pow(rem,3);
			sum=sum+c;
			n=n/10;
		}
		System.out.println("sum ="+sum);
	}
	if(sum==origNum){
		System.out.println("Armstrong Num");
	}
	else{
		System.out.println("Not an Armstrong Num");
	}
}