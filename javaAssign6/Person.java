 // q1 
// Class and Object Basics:
// Create a class Person with attributes name, age and country. Implement methods to set and get these attributes. 
//Create an object of this class, set its attributes, and print out the details.



public class person{
			String name;
			int age;
			String country;

			public person(){

			}


/*   Method 1;
			void setAge(int a){
				age=a;
			}

			void setName(String n){
				name=n;
			}

			void setCountry(String c){
				country=c;
			}

			int getAge(){
				return age;
			}

			String getName(){
				return name;
			}

			String getCountry(){
				return country;
			}

*/

			//Method 2


			void setPerson(String n,int a,String c){
				age=a;
				name=n;
				country =c;
			}

			void getPerson(){
				System.out.println("Name : "+name+"\nAge : "+age+"\nCountry : "+country);
			}


	public static void main(String[] args) {
		person p=new person();
		p.setPerson("Pardeep",23,"India");
		p.getPerson();

		person p1=new person();
		p1.setPerson("Teja",23,"India");
		p1.getPerson();




/*
		p.setName("Pardeep");
		p.setAge(23);
		p.setCountry("India");

		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getCountry());

*/
	}
}

