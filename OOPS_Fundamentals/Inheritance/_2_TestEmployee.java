
// Question:
// Create a class called Person with a member variable name. Save it in a file called Person.java
// Create a class called Employee that will inherit the Person class.
// The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
// Save this in a file called Employee.java
// Your class should have the necessary constructors and getter/setter methods.
// Write another class called TestEmployee, containing a main method to fully test your class definition.
//
// _2_TestEmployee.java
// Test class for _2_Employee and _2_Person

public class _2_TestEmployee {
    public static void main(String[] args) {
        // Test default constructor
        _2_Employee emp1 = new _2_Employee();
        emp1.setName("John Doe");
        emp1.setAnnualSalary(50000.0);
        emp1.setYearStarted(2020);
        emp1.setNationalInsuranceNumber("NI123456A");

        System.out.println("Employee 1:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Annual Salary: " + emp1.getAnnualSalary());
        System.out.println("Year Started: " + emp1.getYearStarted());
        System.out.println("National Insurance Number: " + emp1.getNationalInsuranceNumber());

        // Test parameterized constructor
        _2_Employee emp2 = new _2_Employee("Jane Smith", 75000.0, 2018, "NI654321B");
        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Annual Salary: " + emp2.getAnnualSalary());
        System.out.println("Year Started: " + emp2.getYearStarted());
        System.out.println("National Insurance Number: " + emp2.getNationalInsuranceNumber());
    }
}
