// 7. Demonstrate the use of all access specifiers(public, protected, default and 
// private) with the data members of student class in program 5.

class Student {
    public int rollno;          
    protected String name;      
    private int age;            

    public Student(int rollno, String name,  int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public void GetData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class student3 {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student(1, "Alice", 20);

        System.out.println("Roll No (public): " + student.rollno);



        
        student.GetData();
    }
}
