
class q2{
	public static void main(String[] args) {
		
		//System.out.println("Please year should be greater then 1000");
		int year=Integer.parseInt(args[0]);
		if(year>1000){
			if(year%4==0){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
			}
		}
		else{
			System.out.println("Please enter a valid year value");
		}
		

	}
}