// Program to find min max from the array elements

import java.util.Scanner;
public class minMax{
	public static void main(String[] args) {
		 
		 Scanner sc =new Scanner(System.in);
		 int n;
		 System.out.println("Enter the size of the array");
		 n=sc.nextInt();

		 int[] arr=new int[n];
		 // int[] arr={10,15,5,4,7};


		 //giving the input array element in array
		 System.out.println("Enter the element  of the array");
		 for(int i=0;i<n;i++){
		 	arr[i]=sc.nextInt();
		 }

		 //min max in array {1,2,3,4,5} min=1 & max=5
		 int min=arr[0],max=arr[0];
		 for(int i=0;i<5;i++){
		 	if(arr[i]<min){// one if is for min element 
		 		min=arr[i];
		 	}
		 	if(arr[i]>max){// one is for max element
		 		max=arr[i];
		 	}
		 }
		 System.out.println("minimum element is "+min +" max is "+max);

	}
}