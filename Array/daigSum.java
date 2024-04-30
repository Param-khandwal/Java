// Program to  sum of diagonal elements

import java.util.Scanner;
public class daigSum{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row of the matrix");
		int row=sc.nextInt();

		System.out.println("Enter the col of the matrix");
		int col=sc.nextInt();

		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		int sum[][]=new int[row][col];


		System.out.println("Enter the element of the first array");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr1[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the element of the second matrix");
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					arr2[i][j]=sc.nextInt();
				}
			}


			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					if(i==j){
					sum[i][j]=arr1[i][j]+arr2[i][j];	
					}
				}
			}

			System.out.println("Sum of the matrix is ");
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					System.out.print(sum[i][j]+" ");
				}
				System.out.println("");
			}
	}

}