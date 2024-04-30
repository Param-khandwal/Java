public class persons{
	String name;
	address add;

	public persons(String n,address add){
		this.name=n;
		this.add=add;
	}

	void getdisplay(){
		System.out.println("Name :"+name);
	}

	public static void main(String[] args) {
		address a=new address(57,"Housing Board","hyderabad","Telangana");
		persons p=new persons("Pardeep",a);
		a.getdisplay();
		p.getdisplay();



	}	


}

