// Program to find sum of first and second half of an array

import java.util.Scanner;

public class sumHalfArr{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,sum1=0,sum2=0;
	System.out.println("Enter the value of the array");
	n=sc.nextInt();

	int arr[]=new int[n];
	System.out.println("Enter the element  of the array");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}

	for(int i=0;i<=n/2;i++){
		sum1+=arr[i];
	}
	System.out.println(sum1);

	for(int i=n/2;i<n;i++){
		sum2+=arr[i];
	}
	System.out.println(sum2);
	}

}
