//Write a program to determine if a triangle is equilateral, isosceles, or scalene based on its side lengths.

import java.util.Scanner;
class triangle{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int side1,side2,side3;

		System.out.println("Enter the First side of the traingle");
				side1=sc.nextInt();
		System.out.println("Enter the Second side of the traingle");
				side2=sc.nextInt();
		System.out.println("Enter the Third side of the traingle");
				side3=sc.nextInt();

		if(side1==side2 && side2==side3 && side3==side1){
			System.out.println("equilateral triangle");
		}
		else if(side1==side2 && side2!=side3 && side3!=side1){
				System.out.println("isosceles triangle");
		}
		else if(side1!=side2 && side2!=side3 && side3!=side1){
			System.out.println("scalene triangle");
		}
		
	}
}
