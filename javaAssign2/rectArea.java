
// Calculate the area of a rectangle given its length and width.

import java.util.Scanner;
class rectArea{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length,breadth,area;


		System.out.println("Enter the length of the rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		breadth=sc.nextInt();

		area=length*breadth;

		System.out.println("Area of the rectangle ="+area);

	}
}

