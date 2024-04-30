import java.util.Scanner;
public class avg{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0,count=0,avg;
		System.out.println("Enter the number ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++){
			sum=sum+i;
			count++;
		}

		avg=sum/count;
		System.out.println("Average : "+avg);
	}
}