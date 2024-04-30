// 6. write a program to demonstrate 
// a) Labeled break 
// b) Labeled continue 


public class break_cont{
	public static void main(String[] args) {
		
		System.out.println("Break Statement");
		for(int i=0;i<10;i++){
			if(i==5)
			break;
			System.out.print("\t"+i);
		}

		System.out.println("\nContinue Statement");
		for(int i=0;i<10;i++){
			if(i==5)
			continue;

			System.out.print("\t"+i);


		}
	}
}