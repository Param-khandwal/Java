// Program to add two matrices 

// initailization of the two-d matrix
// int a[3][3]={10,20,30},{40,50,60},{70,80,90};



import java.util.Scanner;
class add2D{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int row,col;
			System.out.println("Enter the row of the matrix");
			row=sc.nextInt();

			System.out.println("Enter the col of the matrix");
			col=sc.nextInt();


			int arr1[][]=new int[row][col];
			int arr2[][]=new int[row][col];


			System.out.println("Enter the row*col value ="+row*col);

			int sum[][]=new int[row][col];

			System.out.println("Enter the element of first matrix");
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
					sum[i][j]=arr1[i][j]+arr2[i][j];
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