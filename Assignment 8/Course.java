// 1. Define a class named Course having data members ID, Description, Duration and 
// Fees. The class should have one parametrized constructors and GetData() function 
// member to display the data. 
// -Create an array of 5 course objects and then display the data for all of 
// them.

import java.util.Scanner;
public class Course{
	private int membersId;
	private String description;
	private String duration;
	private double fees;


	public  Course(int membersId,String description,String duration,double fees){
		this.membersId=membersId;
		this.description=description;
		this.duration=duration;
		this.fees=fees;
	}

	public void getDate(){
		System.out.println(" Members ID:"+ membersId);
		System.out.println(" Description :"+ description);
		System.out.println( "Duration"+ duration);
		System.out.println("Fees "+fees);

	}


	public static void main(String[] args) {
	
	//Scanner sc =new Scanner(System.in);
	Course[] C1=new Course[]{
		new Course(1,"DASSD","6 Months",90_000),
		new Course(2,"DESD","6 Months",90_000),
		new Course(3,"DBDA","6 Months",90_000),
		new Course(4,"VLSI","6 Months",90_000),
		new Course(5,"IOT","6 Months",90_000),
	};
//Displaying data
	for(int i=0;i<C1.length;i++){
		C1[i].getDate();
		System.out.println();
	}
}
}