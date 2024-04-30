// Program to read and print array elements 

import java.util.Scanner;
public class printReadArr{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the size of the array");
			n=sc.nextInt();

			int arr[]=new int[n];
			System.out.println("Enter the element of the array");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}

			System.out.println("Element of the array are");
			for(int i=0;i<n;i++){
				System.out.print(arr[i]+"\t");
			}



	}
}