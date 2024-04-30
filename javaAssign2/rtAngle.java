// H of the rigth angle triangle

import java.util.*;
class rtAngle{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int base,per;
	 // hypo,sum;
	System.out.println("Enter the base of the right angle triangle");
	base=sc.nextInt();
	System.out.println("Enter the perpendicular of the right angle triangle");
	per=sc.nextInt();

	//double sum=();
	double hypo=Math.sqrt(per*per+base*base);

	System.out.println("hypotenuse of a right triangle using the Pythagorean theorem "+ hypo);


	}
}