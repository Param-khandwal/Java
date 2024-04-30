import java.util.Scanner;
public class prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,flag;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		

		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				System.out.println(" not a Prime Number");	
					break;
				}
			else{
				System.out.println(" prime number");
			break;
			}
		}
	}
}