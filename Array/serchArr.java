// Program to search an array elements

import java.util.Scanner;
public class serchArr{
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

		System.out.println("Enter the element you want to search");
		 int target=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==target){
				System.out.println("Found at element at index "+ i);
			}
		}
		System.out.println("Element not found");


	}
}