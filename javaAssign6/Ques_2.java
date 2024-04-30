
// Constructor Overloading:
// Extend the Person class from the previous problem and add multiple constructors 
// (default, parameterized, etc.) to initialize the attributes. Also, include a method to display the details.

public class Ques_2{

	String name;
	int age;
	String country;

	//default constructor
	 public Ques_2 (){

	}

	//parameterized constructor

	public Ques_2(String n,String c, int a){
		name=n;
		country=c;
		age=a;

	}


	void getDisp(){
		System.out.println(" Name:"+name+"\n Age:"+age+"\nCountry "+country);
	}

	public static void main(String[] args) {
		
		Ques_2 p= new Ques_2("pardeep","India",23);
		p.getDisp();
	}


}