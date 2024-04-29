
// 5. Define a class of type Student that has rollno, name and age as private data 
// members. 
// Define SetData() and GetData() as public member functions with 
// appropriate functionality. 
// -Write a program that declares 2 student objects, initializes the first 
// at run-time and second by reading from console, and then displays both student�s 
// data.

import java.util.Scanner;
class student{
	private int rollno;
	private String name;
	private int age;

	public void setData(int r,String n,int a){
		rollno=r;
		name=n;
		age=a;
	}

	public void getData(){
		System.out.println("RollNo :"+rollno+"\nName :"+name+"\nAge :"+age);
	}

	public static void main(String[] args) {
		student s1=new student();
		s1.setData(23,"Pardeep",23);

		Scanner s =new Scanner(System.in);

			
			System.out.println("Enter the name of the student");
				String name=s.nextLine();


			System.out.println("Enter the rollno of the student");
				int rollno=s.nextInt();


			System.out.println("Enter the age of the student");
				int age=s.nextInt();

		student s2=new student();
		s2.setData(rollno,name,age);

		System.out.println("Detail of the student of one");
		s1.getData();

		System.out.println("Detail of the student of second");	
		s2.getData();

	s.close();
	}
}
