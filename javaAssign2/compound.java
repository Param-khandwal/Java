// Calculate the compound interest on an investment using the formula: A = P * (1 + r/n)^(n*t).
import java.util.*;
class compound{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double  principle,time,n, rate,amount;
	

	System.out.println("Enter the principle");
	principle=sc.nextDouble();

	System.out.println("No of times interest compound anually");
	n=sc.nextDouble();

	System.out.println("Enter the rate ");
	rate=sc.nextDouble();

	System.out.println("Enter the time period");
		time=sc.nextDouble();

		amount = principle * Math.pow((1 + rate/n),(n*time));

	System.out.println("Amount you have to pay "+ amount);


	}

}