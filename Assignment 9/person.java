// 1. Define a base class person and a derived class employee with single inheritance. 
// -Define SetData() member functions in each of the class with different signatures to set the data 
// members and demonstrate overloading of member functions. 

// -Define GetData() member functions in each of the class with same signatures to display data and 
// demonstrate overriding of member functions. 


class person{
	String name;
	int id;
	int salary;

	void setData(String n,int i,int s){
		name=n;
		id=i;
		salary=s;
	}

	void getData(){
		System.out.println("Name :"+name+"\nID :"+id+"\n Salary"+salary);
	}
}

class employee extends person{
	int bonus;
		public void setData(int b){
			bonus=b;
		}

		public void getData(){
			System.out.println("Bounus :"+bonus);
		}

	public static void main(String[] args) {
		person p=new person();
		p.setData("Pardeep",1234,212121);
		employee e =new employee();
		e.setData(100);
		e.getData();

		// e.setData(1000);
		// e.getData();
	}
}


