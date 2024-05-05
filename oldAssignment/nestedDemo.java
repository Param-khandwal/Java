//  javac .\nestedDemo.java
//java nestedDemo$Inner





class nestedDemo{
	private int data=90;
	protected String name="Pardeep";

	class Inner{
		void message(){
			System.out.println(data +" "+name);
		}
	}

	void display(){
		Inner n =new Inner();
		n.message();
	}

	public static void main(String[] args) {
		nestedDemo n=new nestedDemo();
		n.display();
	}
}