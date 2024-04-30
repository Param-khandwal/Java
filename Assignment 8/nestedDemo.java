// 10. Write a program to demonstrate the use of nested class and its objects when 
// nested class is a 
// a) private member of the outer class 
// b) public member of the outer class. 

class nestedDemo{
		private String name="Pardeep";
		public int age=23;

		class Inner{
			void msg(){
				System.out.println("Name :"+name+"\n age :"+age);
			}
		}

		void display(){
			Inner in =new Inner();
			in.msg();
		}


	public static void main(String[] args) {
		nestedDemo n=new nestedDemo();
		n.display();
	}

}