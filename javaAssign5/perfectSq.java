import java.util.Scanner;
public class perfectSq{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number which you want to check it is perfect square or not");
		int num=sc.nextInt();
		int flag=0;
		for(int i=1;i<num;i++){
			if(i*i==num){
				flag=1;
			}
		}

		if(flag==1)
				System.out.println("It is a perfect square");
			else
		System.out.println("not a perfect square");
	}
}