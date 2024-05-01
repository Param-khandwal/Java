// 2. Modify program 1 to define a parametrized constructor and finalizer in each class. 
// Demonstrate calling the constructor of the base class from the constructor of the derived class. 
// -Create objects of person and employee classes to show the order of invocation of constructors. 

class person{
    String name;
    int id;
    int salary;

    person(String n, int i, int s){
        name = n;
        id = i;
        salary = s;
    }


    void getData(){
        System.out.println("Name: " + name + "\nID: " + id + "\nSalary: " + salary);
    }

   
}

class employee extends person{
    int bonus;

    employee(String n, int i, int s, int b){
        super(n, i, s); 
        bonus = b;
    }

    
    public void getData(){
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {

        System.out.println("Creating person object...");
        person p = new person("Pardeep", 1234, 212121);

        System.out.println("\nCreating employee object...");
        employee e = new employee("Employee", 5678, 232323, 100);

        p.getData();
        e.getData();
    }
}
