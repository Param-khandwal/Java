// 9. Encapsulation and Access Modifiers:
// Create a class Student with private attributes name, rollNumber, and grade. 
// Provide public methods to get and set these attributes. 
// Additionally, implement a method to display the student's information.


public class student{

	private String name;
	private int rollNo;
	private String grade;

	public student(String n,int r,String g){
		this.name=n;
		this.rollNo=r;
		this.grade=g;
	}

	public void setName(String name){
		name=name;
	}

	public void getName(){
		return name;
	}

	public void setRollno(int rollNo){
		rollNo=rollNo;
	}

	public void getRollno(){
		return rollNo;
	}

	public void setGrade(String grade){
		grade=grade;
	}

	public void getGrade(){
		return grade;
	}

	public void display(){
		System.out.println("Name :"+name+"\nrollNo :"+rollNo+"\ngrade :"+grade);
	}
	
	public static void main(String[] args) {
		student s=new student("Pardeep",23,"A");
		s.display();
	}

}

