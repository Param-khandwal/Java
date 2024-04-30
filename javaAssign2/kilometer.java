// Convert a distance from kilometers to miles using the formula: miles = kilometers * 0.621371.

import java.util.Scanner;
class kilometer{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kilometers");
		int km;
		km=sc.nextInt();

		double miles=km* 0.621371;

		System.out.println("Miles ="+miles);
	}
}