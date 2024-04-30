// Program to find the sum of squares of odd index values 

import java.util.Scanner;
public class oddIndArr{
	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int i,n,sq=0,sum=0;
			System.out.println("Enter the size of the array");
			n=sc.nextInt();

			int arr[]=new int[n];
			System.out.println("Enter the element of the array");
			for(i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}

			for( i=0;i<n;i++){
				if(i%2!=0){
					sq=arr[i]*arr[i];
					sum=sum+sq;
					//System.out.print(sq+"\t");
				}
			}
				    System.out.print(sum+"\t");
			
	}
}