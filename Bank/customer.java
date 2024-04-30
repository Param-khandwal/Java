import java.util.Scanner;
public class customer{
	private int cId;
	private String cName;
	private double cPhoneNum;
	private static String bank="SBI";
	private account acc;
	Scanner sc=new Scanner(System.in);  

	public customer(int cId,String cName,double cPhoneNum,account acc){
		this.cId=cId;
		this.cName=cName;
		this.cPhoneNum=cPhoneNum;
		this.acc=acc;
	}

	public void disp(){
		System.out.println("Customer ID: "+cId+"\nCustomer Name:"+cName+"\nCustomer Phone Number:"+cPhoneNum);
		

		
		while(true){
			System.out.println("Enter the opertion you want to apply \n1.Deposit \n2.Withdraw \n3.Interest \n4.Display");
			
			int ch=sc.nextInt();


				switch(ch)
				{	
				case 1:
				    	acc.disp();

				    case 2:
				    	acc.deposit();

				    case 3:
				    	acc.withDraw();

				    case 4:
				    	acc.calInterest();

				
				}
			}
	}
}

