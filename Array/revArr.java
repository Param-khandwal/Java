// Program to reverse elements of the array 

import java.util.Scanner;
public class revArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Reverse of the array element");
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}



	}
}