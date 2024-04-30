// Program to  multiply two matrices 

import java.util.Scanner;
class mul2D{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row of the matrix");
		int row=sc.nextInt();

		System.out.println("Enter the col of the matrix");
		int col=sc.nextInt();

		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];

		System.out.println("Enter the element of the first array");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr1[i][j]=sc.nextInt();
			}
		}

		System.out.println("print the element of the matrix one");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println( );
		}



		System.out.println("Enter the element of the second matrix");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr2[i][j]=sc.nextInt();
			}
		}		

		System.out.println("print he element of the matric second");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println( );
		}

		int arr3[][]=new int[row][col],sum=0;
		System.out.println("Matrix multiplication");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				sum=0;
				for(int k=0;k<row;k++){
					sum=sum+arr1[i][k]*arr2[k][j];
					arr3[i][j]=sum;
				}
			}
		}


		System.out.println("output of the multiplication");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println( );
		}



	}
}
