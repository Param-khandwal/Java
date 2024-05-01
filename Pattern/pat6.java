import java.util.Scanner;
class pat6{
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
	    int	s=n;
		for(int i=1;i<=n*2-1;i++){
			for(int j=1;j<=n;j++){
				if(j>=s)
					System.out.print(i+","+j);
				else
					System.out.print(" ");
			}
			if(i<n)
				s--;
			else
				s++;
		
		System.out.println();
	}
	}
}


 //    *
 //   * *
 //  * * *
 // * * * *
 //  * * *
 //   * *
 //    *