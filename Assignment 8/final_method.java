// 4. Write a program to demonstrate the use of final keyword with 
// a) class 
// b) method 
// c) data member(primitive value and reference variable and show that you 
// can not refer this reference variable to other objects but can change the data 
// field of a final reference variable) 

public class  final_method{
	//final int age=23;

	final  void  method(int a){
		System.out.println("I am interger");
	}

	 void method(int a){
	 	System.out.println("I am String ");
			
		}

public static void main(String[] args) {
	//	age=25;
	//	System.out.println(age);

		final_method f=new final_method();
		f.method(1);
		f.method(2);
		


		
		//System.out.println(final_method);

}

}