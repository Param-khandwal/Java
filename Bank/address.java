public class address{
	private int hNo;
	private String address;
	private int pinCode;
	private String city;
	private String state;



	public address(int hNo,String address,int pinCode,String city,String state){
	this. hNo=hNo;
	this.address=address;
	this. pinCode=pinCode;
	this. city=city;
	this.state=state;
	}

	void disp(){
		System.out.println("House No: "+hNo+" \nAdress : "+address+" \npinCode :"+pinCode+"\ncity :"+city+"\nstate :"+state);
	}
}