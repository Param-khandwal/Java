class leap{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		System.out.println(args[0]);

		if(a>=1885){
		if(a%4==0){
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
		else{
			System.out.println("invalid year");
		
	}

}
}