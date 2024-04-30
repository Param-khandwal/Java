// 4. Static Variable:
// Create a class BankAccount with accno, accType, Balance and static variable interestRate. 
// Initialize it using a static block. Implement methods to deposit and withdraw funds. 
// Create objects and display details.



public class bank{
	String accname;
	int accno;
	String accType;
	double balance;
 	
 	public bank(String acN,int accN,String accT,double b){
 		this.accname=acN;
 		this.accno=accN;
 		this.accType=accT;
 		this.balance=b;
 	}

 	void display(){
 		System.out.println("Account holder Name :"+accname+"\nAccount Number: "+accno+"\nAccount :"+accType+"\nBalance :"+balance);
 	}

 	void Interest(){
 		double si;
 		si=balance*6.5*5/100;
 		System.out.println("Interest given by the bank :"+si);
 	}

 	void deposit(){
 		double deposit=500;
 		if(balance>0){
 			balance=balance+deposit;
 			System.out.println("Total Balance :"+balance);

 		}
 		else{
 			System.out.println("Insufficient balane");
			 			
 		}
 	}

 	void withdraw(){
 		double withdraw=1500;
 		if(balance>0){
 			balance=balance-withdraw;
 			System.out.println("Total Balance :"+balance);
 		}
 		else{
 			System.out.println("Insufficient balane");
			 			
 		}
 	}

 		public static void main(String[] args) {
 			
 			bank b=new bank("Pardeep",54321,"Savings",2000.0);
 			b.display();		

 			b.Interest();
 			
 			b.deposit();


 			b.withdraw();


 		}

}
