import java.util.Scanner;
class pat8{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// int n=sc.nextInt();
		int n=5;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			n--;
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			n++;
			System.out.println(" ");

		}

	}
}

      
 //    * 
 //   *** 
 //  ***** 
 // ******* 
