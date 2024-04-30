// 4. Rework with the function and the program so that it finds the sum of elements 
// when the index of the starting element and the number of elements is specified. 


import java.util.Scanner;
public class arrar_sum{

	 	public int findSum(int arr[],int startInd,int endInd){
	 			int sum=0;
	 			for(int i=startInd;i<startInd+endInd && i<arr.length;i++){
	 				sum+=arr[i];
	 			}
	 			return sum;
	 	}

	 	public static void main(String[] args) {
	 		Scanner sc =new Scanner(System.in);
	 		arrar_sum ar_sum=new arrar_sum();

	 		int arr[]=new int[]{1,2,3,4,5};

	 		// System.out.println("Enter the size of the array");
	 		// int size=sc.nextInt();

	 		// int[] arr=new int [size];

	 		// System.out.println("Enter the  element of the array");
	 		// for(int i=0;i<size;i++){
	 		// 	arr[i]=sc.nextInt();
	 		// }
	 		


	 		System.out.println("Enter the starting index");
	 		int s=sc.nextInt();

	 		System.out.println("Enter the ending index");
	 		int e=sc.nextInt();

	 		int sum=ar_sum.findSum(arr,s,e);
	 		System.out.println(sum);

	 	}
}