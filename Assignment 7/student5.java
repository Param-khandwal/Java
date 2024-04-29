
// 9. Define a class of type address that has street, locality and city as members. 
// -Rework program 5 to add to the student class an object of address class 
// as a data member which stores the student's address.


// import java.util.Scanner;

class Address{
	private String street;
	private String locality;
	private String city;

	public void setAddress(String s,String l,String c){
		this.street=s;
		this.locality=l;
		this.city=c;
	}

	 public String getAddress() {
        return street + ", " + locality + ", " + city;
    }


}
class student{
	private int rollno;
	private String name;
	private int age;
	private Address address;

	public void setData(int r,String n,int a,Address addr){
		rollno=r;
		name=n;
		age=a;
		address=addr;
	}

	public void getData(){
		System.out.println("RollNo :"+rollno+"\nName :"+name+"\nAge :"+age+"\nAddress :"+address.getAddress());
	}

}

	public class student5{
	public static void main(String[] args) {
		student s1=new student();
		Address a=new Address();
		a.setAddress("Housing Board","Shamshbad","Hyderabad");
		s1.setData(23,"Pardeep",23,a);

		

		System.out.println("Detail of the student of one");
		s1.getData();


	}
}


/*

import java.util.Scanner;

class Address {
    private String street;
    private String locality;
    private String city;

    public void setAddress(String street, String locality, String city) {
        this.street = street;
        this.locality = locality;
        this.city = city;
    }

    public String getAddress() {
        return street + ", " + locality + ", " + city;
    }
}


class Student {
    private int rollno;
    private String name;
    private int age;
    private Address address; // Object of Address class

    public void SetData(int r, String n, int a,  Address addr) {
        rollno = r;
        name = n;
        age = a;
        address = addr;
    }

    public void GetData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address.getAddress());
        
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        int[] marks1 = { 80, 75, 90, 85, 95 };
        Address addr1 = new Address();
        addr1.setAddress("123 Main St", "Central", "CityA");
        s1.SetData(1, "Alice", 20, marks1, addr1);


        System.out.println("\nStudent 1:");
        s1.GetData();

       

    }
}

*/