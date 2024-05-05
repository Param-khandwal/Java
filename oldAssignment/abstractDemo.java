 abstract class abstractDemo{
 	abstract void run();
 }

 class Honda extends abstractDemo{
 	void run(){
 		System.out.println("Run safely");
 	}

 	public static void main(String[] args) {
 		abstractDemo a=new Honda();
 		a.run();
 	}
 }