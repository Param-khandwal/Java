// Using this:
// Modify the Person class to include a method that displays the name and age of the object. 
// Use this keyword to differentiate between class variables and method parameters.
//  Implement a method to compare two Person objects based on their age.


public class ques3{
	String name;
	int age;
	// String country;


	
	public ques3(String n,int a){
		this.name=n;
		this.age=a;
	}

	void display(){
		System.out.println("Name:"+name+"\n age :"+age);
	}

	 void compare(int age1, int age2){
		if(age1>age2)
			System.out.println("person one is elder");
		else
			System.out.println("person 2 is younger");
	}


	
}

class Demo{
public static void main(String[] args) {
		
		ques3 p=new ques3("pardeep",23);
		p.display();


		ques3 p1=new ques3("teja",22);
		p1.display();


		p1.compare(p.age,p1.age);

	}	
}