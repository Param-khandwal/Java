

// interface
interface B{
	void show();
	
}


public class anonymous{
	public static void main(String[] args) {
		B b = new B(){
		public void show(){
			System.out.println("Anonymous implementation ");
			}
		};
	
		
	
	b.show();
		
	}

	}
