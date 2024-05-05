abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	void draw(){
		System.out.println("rectangle");
	}
}
class circle extends shape{
	void draw(){
		System.out.println("circle");
	}
}

class test{
	public static void main(String[] args) {
		shape s1=new rectangle();
		shape s=new circle();
		s.draw();
		s1.draw();
	}

}
