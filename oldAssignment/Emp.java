// Abstraction 

abstract class Person{
	abstract void eat();
}

class Emp{
	public static void main(String[] args) {
		Person p=new Person(){
			void eat(){
				System.out.println("nice ");
			}
		};
		p.eat();
	}
}