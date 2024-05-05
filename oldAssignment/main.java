class person{
	void message(){
		System.out.println("welcome");
	}

	void display(){
		System.out.println("i forget something");
	}

}
class student extends person{
	void message(){
		System.out.println("welcome 2");
	}

	void display(){
		message();
		super.display();
		super.message();
	}
}

public class main{
public static void main(String[] args) {
		person p=new person();
		student s=new student();
		s.display();
		//p.display();

	}
}