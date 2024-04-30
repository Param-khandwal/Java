// 7. Class and methods:
// Create a class Calculator with relevant data members and a constructor.
//  Implement methods for basic arithmetic operations (addition, subtraction, multiplication, division, modulus) 
//  and demonstrate their usage.

import java.util.Scanner;
public class cal{
		int a;
		int  b;

		public cal(int a,int b){
		this.a=a;
		this.b=b;
	}

	//Addition
	int sum(int a,int b){
		int result;
		result=a+b;
		System.out.println("Addition :"+result);
		return result;      
	}

	//Subtraction
	int sub(int a,int b){
		int result;
		if(a>b)
			{result=a-b;
					System.out.println("Subtraction :"+result);}
		else
			{result=b-a;
					System.out.println("Subtraction :"+result);	}
		return result;
	}

	//Multiplication
	int mul(int a,int b){
		int result;
		result=a*b;
		System.out.println("Addition :"+result);
		return result;      
	}

	//Division
	double div(double a,double b){
		double result;
		if(a>b){
					result=a/b;
				System.out.println("Division :"+result);
				}
		else{
					result=b/a;
				System.out.println("Division :"+result);}
			return result;
	}

	//Modulos
	int mod(int a,int b){
			int result;
		result=a%b;
		System.out.println("Modulos :"+result);
		return result;
	} 
}


class demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number");
		int a=sc.nextInt();

		System.out.println("Enter the second number");
		int b=sc.nextInt();

		cal c=new cal(a,b);

		c.sum(a,b);
		c.sub(a,b);
		c.div(a,b);
		c.mod(a,b);
		c.mul(a,b);



	}
}