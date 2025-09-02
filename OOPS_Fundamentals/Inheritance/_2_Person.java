
// Question:
// Create a class called Person with a member variable name. Save it in a file called Person.java
// Create a class called Employee that will inherit the Person class.
// The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
// Save this in a file called Employee.java
// Your class should have the necessary constructors and getter/setter methods.
// Write another class called TestEmployee, containing a main method to fully test your class definition.
//
// _2_Person.java
// Person class with member variable name

public class _2_Person {
    private String name;

    public _2_Person() {
    }

    public _2_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
