// 2. Modify program 1 to add a default constructor and a SetData() member 
// function. 
// -Create an array of 3 student using the default constructor and another 
// array of 2 students using the parametrized constructor, and then display the 
// data of all 5 course objects. 


public class Course2{
	private int membersId;
	private String description;
	private String duration;
	private double fees;

	public Course2(){

	}


	public  Course2(int membersId,String description,String duration,double fees){
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
	
	Course2[] C1=new Course2[]{
		new Course2(),
		new Course2(),
		new Course2(),
		new Course2(4,"VLSI","6 Months",90_000),
		new Course2(5,"IOT","6 Months",90_000),
	};
//Displaying data
	for(int i=0;i<C1.length;i++){
		C1[i].getDate();
		System.out.println();
	}
}
}