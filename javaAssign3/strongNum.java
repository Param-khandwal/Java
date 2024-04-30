import java.util.Scanner;
class strongNum{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int origNum,n,rem,sum=0,f=1;
			System.out.println("Enter any num ");
			n=s.nextInt();

			origNum=n;
			while(n>0){

				rem=n%10;
				int fact=1;
				for(int i=1;i<=rem;i++){
						fact=fact*i;
					}

				sum=sum+fact;
				n=n/10;
			}
			System.out.println("Sum of the number is  "+origNum+" is "+sum);

			if(origNum==sum){
				System.out.println("It is an strong Number");
			}
			else{
				System.out.println("Not an strong number");
			}
	}
}