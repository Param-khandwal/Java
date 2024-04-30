// Convert a temperature from Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32

import java.util.Scanner;
class temp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		float temp,far;
		System.out.println("Please enter the temprature in degree celcius");
		temp=sc.nextFloat();

			far=(temp * 9/5) + 32;

			System.out.println("Your temprature in Fahrenheit "+far);


	}
}