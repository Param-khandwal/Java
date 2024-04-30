import java.util.Scanner;
class areofCir{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		float area,r;
		System.out.println("Please enter the radius of the circle");
		r=sc.nextFloat();

		area=3.14f*r*r;

		System.out.println("Area of the circle : "+area);
		
	}
}