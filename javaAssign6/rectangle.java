// 6. Using this in Constructors:
// Create a class Rectangle with attributes length and width.
//  Implement a parameterized constructor that initializes these attributes. 
//  Use this to differentiate between class variables and constructor parameters. 
//  Include methods to calculate the area and perimeter.

import java.util.Scanner;

public class rectangle{
	int length;
	int breadth;
	
	public rectangle(int l,int b){
		this.length=l;
		this.breadth=b;
	}

	void area(){
		int area=length*breadth;
		System.out.println("Area of rectangle :"+area);
	}

	void perimeter(){
		int perimeter=2*(length+breadth);
		System.out.println("Perimeter of the rectangle : "+perimeter);
	}


}


class demo{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		

		System.out.println("Enter the length of the rectangle");
		int l=sc.nextInt();

		System.out.println("Enter the breadth of the rectangle");
		 int b=sc.nextInt();


		rectangle r=new rectangle(l,b);
		
		

		r.area();
		r.perimeter();

	}
}

