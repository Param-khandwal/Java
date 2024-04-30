import java.util.Scanner;
class grade
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your marks to get your grade");
	int grade=sc.nextInt();

	if(grade>=90 &&  grade<100){
		System.out.println("A");
	}	
	else if(grade>=89 &&  grade<80){
		System.out.println("B");
	}
	else if(grade>=79 &&  grade<70){
		System.out.println("B");
	}
	else if(grade>=69 &&  grade<60){
		System.out.println("B");
	}
	else if(grade>60 ){
		System.out.println("Fail");
	}
	else{
		System.out.println("Those who hot good marks improve your self \n those who fail pray to god");
	}


}
}