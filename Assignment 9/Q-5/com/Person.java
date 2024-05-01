// 5. Write a java file Person.java containing definition of independent class Person in package com.person, 
// and another java file Address.java containing definition of independent class Address in com.address 
// package. 

// -Write a container class employee that has a person and an address object as contained data 
// members (besides other data members) by importing the above packages. 

// -Demonstrate the passing of arguments in the constructors of person and address classes by the 
// constructor of the employee class.

package com.person;

public class Person{
	String name;
	int age;

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	 public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}