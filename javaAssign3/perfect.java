import java.util.Scanner;
class perfect{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int origNum,n,sum=0;
		System.out.println("Enter the number you want to check it si perfect or not");
		n=sc.nextInt();	

		origNum=n;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}

		if(origNum==sum){
			System.out.println("perfect number");
		}
		else{
			System.out.println("not a perfect number");

		}
		
		
	}
}