// Program to find the sort of an array 

import java.util.Scanner;
import java.util.Arrays;

public class sortArr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the element of the array ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		//Ascending order of the element
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
			}


		//Descending order of the element
		// Arrays.sort(arr);
		// for(int i=n-1;i>=0;i--){
		// 	System.out.print(arr[i]+"\t");
		// 	}

		}



	}
