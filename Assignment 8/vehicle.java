// 8. Demonstrate the use of "super" keyword. 
// a) To refer to a member of super class. 
// b) To call super class constructor from sub class constructor. 


//without super keyword
/*
class vehicle{
	int speed=50;
}

class car extends vehicle{
	int speed=100;


void display(){
	System.out.println("speed "+speed);
}

public static void main(String[] args) {
	car c=new car();
	c.display();
}
}

*/

//with super keyword

class vehicle{
	int speed=50;
}

class car extends vehicle{
	int speed=100;


void display(){
	System.out.println("speed "+super.speed);
}

public static void main(String[] args) {
	car c=new car();
	c.display();
}
}
