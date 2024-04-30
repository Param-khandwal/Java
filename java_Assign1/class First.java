class First{
	 public static void main(String args[]){

	 	//int a=args[0]; String cannot be converted into interger
	 	//int b=args[1];   


	 	int a=Integer.parseInt(args[0]);
	 	int b=Integer.parseInt(args[1]);
	 	System.out.println("Hello World !");

	 	System.out.println("SUM :"+ (a+b));

	 }

}