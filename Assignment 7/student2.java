 //6. Demonstrate the access specifiers public and default with the student class 
// in program 5 and also demonstrate that other access specifiers(protected and 
// private) can not be used with class. 

import java.util.Scanner;
public class student2{
	private int rollno;
	protected String name;
	public int age;

	public void setData(int r,String n,int a){
		rollno=r;
		name=n;
		age=a;
	}

	public void getData(){
		System.out.println("RollNo :"+rollno+"\nName :"+name+"\nAge :"+age);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student s1=new student();
		s1.setData(23,"Pardeep",23);	


		System.out.println("Detail of the student of one");
		s1.getData();

		student s2 = new student();
         s2.rollno = 2; // Error: 'rollno' has private access in 'Student'
        s2.name = "Bob"; // Accessing protected member
        s2.age = 25;     // Accessing public member
		
		
	

	}
}