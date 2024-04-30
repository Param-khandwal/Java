 public class bank{


 	


 	public static void main(String[] args) {
	


	address a1=new address(57,"Houshing Board",40127,"Hyderabad","Telangana");//address refrence
	account a2=new account(4312,"Saving",1000,a1);//account refrence
	customer c1=new customer(12345,"Pardeep",99710,a2);//customer refrence

	c1.disp();		
 	



 	}

 }