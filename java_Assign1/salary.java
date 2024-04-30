
// Write a program to calculate the net salary of an employee based on the following conditions:
// If the basic salary is less than or equal to 10000, the HRA (House Rent Allowance) is 20% of the basic
// salary
// and the DA (Dearness Allowance) is 80% of the basic salary.
// If the basic salary is greater than 10000, the HRA is 25% of the basic salary
// and the DA is 90% of the basic salary.

import java.util.Scanner;
class salary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary=sc.nextInt();
		int hra,da;
		if(salary<10000){
			hra=((salary*20)/100);
			da=((salary*80)/100);
			System.out.println("House Rent Allowance="+hra);
			System.out.println("Dearness Allowance="+da);
		}
		else if(salary>10000){
			hra=((salary*25)/100);
			da=((salary*90)/100);
			System.out.println("House Rent Allowance="+hra);
			System.out.println("Dearness Allowance="+da);
		}
		else{
			System.out.println("please enter valid salary");
		}


	}
}