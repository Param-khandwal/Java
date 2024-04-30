import java.util.*;
class interest{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int principle,time;
	float rate,interest;

	System.out.println("Enter the principle ");
	principle=sc.nextInt();
	System.out.println("Enter the time");
	time=sc.nextInt();
	System.out.println("enter the rate");
	rate=sc.nextFloat();

	interest=(principle*time*rate)/100f;

	System.out.println("interest of the principle "+ interest);


	}
}