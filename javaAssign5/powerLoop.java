import java.util.Scanner;
class powerLoop{
	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 int base,expo,power=0;
		 System.out.println("Enter the value of base and expo");
		 base=sc.nextInt();
		 expo=sc.nextInt();

		 for(int i=1;i<=expo;i++){
		 	power=power*base;
		 }

		 System.out.println("Power = "+power);
	}


}