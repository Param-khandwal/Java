// Determine the volume of a sphere given its radius using the formula: V = (4/3) * π * r^3.

import java.util.*;
class sphere{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		double vol,r;
		System.out.println("Please enter the radius of the circle");
		r=sc.nextDouble();

		vol = (4/3) * 3.14 * (Math.pow(r,3));

		System.out.println("Volume if the sphere is "+ vol);

	}
}