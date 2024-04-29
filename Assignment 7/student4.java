// 8. Modify program 5 to add another array member marks to the class that stores 
// marks of 5 subjects and then rework with the program. 


import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private int age;
    private int[] marks; // Array to store marks of 5 subjects

    public void SetData(int r, String n, int a, int[] m) {
        rollno = r;
        name = n;
        age = a;
        marks = m;
    }

    public void GetData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class student4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        int[] marks1 = { 80, 75, 90, 85, 95 };
        s1.SetData(1, "Alice", 20, marks1);

        //student 2 result 
        Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Name:");
        String name = sc.nextLine();


        System.out.println("Enter Roll No:");
        int roll = sc.nextInt();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Marks for 5 subjects:");
        int[] marks2 = new int[5];
        for (int i = 0; i < 5; i++) {
            marks2[i] = sc.nextInt();
        }

        Student s2 = new Student();
        s2.SetData(roll, name, age, marks2);

        System.out.println("\nStudent 1:");
        s1.GetData();

        System.out.println("\nStudent 2:");
        s2.GetData();

        sc.close();
    }
}
