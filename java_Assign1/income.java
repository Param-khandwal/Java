// 10. Write a program to calculate the income tax payable by an individual based on their annual income,
// considering the following tax slabs:
// Income less than or equal to 2.5 lakhs: No tax.
// Income greater than 2.5 lakhs and less than or equal to 5 lakhs: 5% of the income.
// Income greater than 5 lakhs and less than or equal to 10 lakhs: 10% of the income.
// Income greater than 10 lakhs: 15% of the income.


import java.util.Scanner;
class income{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your income");	
		int income,AfterTax;
		income=sc.nextInt();

		if(income<250000){
			System.out.println("No Tax ");
		}
		else if(income>250000 && income<=500000){
			System.out.println("5% of the tax on your income");
			AfterTax=(income*5)/100;
			System.out.println("Your  tax is = "+AfterTax);
		}
		else if(income>500000 && income<=1000000){
			System.out.println("10% of the tax on your income");
			AfterTax=(income*10)/100;
			System.out.println("Your tax  is = "+AfterTax);
		}
		else if(income>1000000){
			System.out.println("10% of the tax on your income");
			AfterTax=(income*15)/100;
			System.out.println("Your tax  is = "+AfterTax);
		}
		else{
			System.out.println("Happy");
		}

	}
}