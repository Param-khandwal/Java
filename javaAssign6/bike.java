public class bike{
	int number;
	String _Color;
	int milage;
	String model;
	static String _Company="Royal Enfield";


	 bike(){

	}
	
	 bike(int n,String c,int m,String m1){
		number=n;
		_Color=c;
		milage=m;
		model=m1;
	}

	void display()
	{
		System.out.println(number+" "+_Color+" "+milage+" "+ model+" "+_Company);
	}

	

	public static void main(String[] args) {
		bike b=new bike(1234,"black",14,"Classic 350");
		bike b2=new bike(4312,"black",10,"Dominar");
		bike b3=new bike();

		b.display();
		b2.display();
		b3.display();
	}
}