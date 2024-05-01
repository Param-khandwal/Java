import com.person.Person;
import com.address.Address;

public class Employee {
    private Person person;
    private Address address;
    private String designation;

    public Employee(String name, int age, String street, String city, String designation) {
        person = new Person(name, age);
        address = new Address(street, city);
        this.designation = designation;
    }

    public String getDetails() {
        return "Name: " + person.getName() + "\nAge: " + person.getAge() +
               "\nStreet: " + address.getStreet() + "\nCity: " + address.getCity() +
               "\nDesignation: " + designation;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "123 Main St", "Anytown", "Manager");
        System.out.println(employee.getDetails());
    }
}
