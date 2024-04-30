import java.util.Scanner;
public class account{
	private int accNo;
	private String accType;
	private double balance;
	private address add;
		Scanner sc=new Scanner(System.in);
 


	public account(int accNo,String accType,int balance,address add){
		this.accNo=accNo;
		this.accType=accType;
		this.balance=balance;
		this.add=add;
	}


	void disp(){
		System.out.println("Account Num :"+accNo+"\nAccount Type :"+accType+"\nBalance :"+balance);
		add.disp();
	}

	public double calInterest(){
		double si;
		si=balance*6.5*5/100;
		System.out.println("Jayda umeed mat rakho itna hi milega :"+si);
		return si;
	}

	void deposit(){
		System.out.println("Enter amt to deposit");
		double extraMoney=sc.nextDouble();
	    balance=balance+extraMoney;
		System.out.println("New Balance after Deposit : "+balance);
	}

	void withDraw(){
		System.out.println("Enter amt to withdraw");
		double takeoutMoney=sc.nextDouble();
		if(balance<=0){
			System.out.println("No money you are Broke!");
		}
		else{
				    balance=balance-takeoutMoney;
				System.out.println("after withDraw "+balance);
			}
	}

}