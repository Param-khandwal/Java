// Program to find the sum and average of array

import java.util.Scanner;
public class arrSum{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int arr[]=new int[5];
		int sum=0,len=arr.length;
		double avg;

		System.out.println("Enter the element of the array");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<len;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum of the array " +sum);


			avg=sum/len;

			System.out.println("Average of the array is "+avg);


	}


}