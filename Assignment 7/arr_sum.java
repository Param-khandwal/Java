// 3. Write a user-defined function to find the sum of an array passed as argument. 
// -Write a program that declares an array of 10 elements and uses this 
// function to 
// a) Find the sum of all elements. 

// b) Find the sum of first 5 elements. 

// c) Find the sum of last 5 elements.

import java.util.*;
class arr_sum{

	//sum of 1st array
	public int findSum(int[] arr){
		int sum=0;

		for(int num:arr){
			sum+=num;
		}
		return sum;

	}

	//sum of 2nd array
	public int findSum2(int[] arr){
		int sum=0;

		for(int i=0;i<arr.length/2;i++){
			sum+=arr[i];
		}
		return sum;

	}

	//sum of 3rd array
	public int findSum3(int[] arr){
		int sum=0;

		for(int i=5; i<10;i++){
			sum+=arr[i];
		}
		return sum;

	}
	public static void main(String[] args) {

		arr_sum a=new arr_sum();

		Scanner sc =new Scanner(System.in);

		// System.out.println("Enter the size of the array");
		// int n=sc.nextInt();

		System.out.println("Enter the element of the array");
		int[] arr=new int[10]; 
		int sum=0;	
		int sum2=0;
		int sum3=0;	

		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}

		 sum=a.findSum(arr);
		 sum2=a.findSum2(arr);
		 sum3=a.findSum3(arr);


		System.out.println("Sum of array :"+ sum);
		System.out.println("Sum of array :"+ sum2);
		System.out.println("Sum of array :"+ sum3);



		
	}
}