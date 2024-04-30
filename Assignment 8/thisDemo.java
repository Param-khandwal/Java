// 7. Demonstrate the use of "this" keyword 
// a) To refer to current object. 
// b) Inside a constructor to call another constructor. 
// And also show that this can not be used in static context area. 



// public class thisDemo{
// 		String name;
// 		int age;
// 		String institute;

// 		public thisDemo(String n,int a,String i){
// 			this.name=n;
// 			this.age=a;
// 			this.institute=i;
// 		}

// 		void display(){
// 			System.out.println("Name :"+name+"\nage :"+age+"\nInstitute :"+institute);
// 		}

// 		public static void main(String[] args) {
// 			thisDemo t = new thisDemo("Pardeep",23,"Cdac");
// 			t.display();

// 		}
// }


// constructor inside constructor

public class thisDemo{
		String name;
		int age;
		String institute;
		String course;

		public thisDemo(String n,int a,String i){
			this.name=n;
			this.age=a;
			this.institute=i;
		}

		public thisDemo(String n,int a,String i,String c){
			this (n,a,i);
			this.course=c;
		}

		void display(){
			System.out.println("Name :"+name+"\nage :"+age+"\nInstitute :"+institute+"\n Course :"+course);
		}

		public static void main(String[] args) {
			thisDemo t = new thisDemo("Pardeep",23,"Cdac","DASSD");
			t.display();

		}
}