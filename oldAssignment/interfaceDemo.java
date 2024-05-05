interface printable{
	void print();
}

interface showable extends printable{
	void show();
}

class interfaceDemo implements showable{
	public void print(){
		System.out.println("hello");
	}

	public void show(){
		System.out.println("hello 2");
	}

	public static void main(String[] args) {
		interfaceDemo a =new interfaceDemo();
		a.print();
		a.show();
	}
}