class q1{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);

		if(a>0)
			System.out.println("poitive number");
		else if(a<0)
			System.out.println("Negative Number");
		else if(a==0)
			System.out.println("Number enter is zero");
		else
			System.out.println("Invalid input");
	}
}