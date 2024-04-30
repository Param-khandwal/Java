// 8. Composition and Aggregation:
// Create a class Address with attributes street, city, and state. 
// Then create a class Person with attributes name and an Address object. 
// Demonstrate how to use composition to model the relationship between a person and their address.


public class address{
	int hNo;
	String street;
	String city;
	String state;

	public address(int h,String s,String c,String s1){
			this.hNo=h;
			this.street=s;
			this.city=c;
			this.state=s1;
		}

	void getdisplay(){
		System.out.println("House no. :"+hNo+" \nStreet :"+street+"\n City :"+city+"\n State: "+state);
	}

	
}