
// Question:
// Create a class called Person with a member variable name. Save it in a file called Person.java
// Create a class called Employee that will inherit the Person class.
// The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.
// Save this in a file called Employee.java
// Your class should have the necessary constructors and getter/setter methods.
// Write another class called TestEmployee, containing a main method to fully test your class definition.
//
// _2_Employee.java
// Employee class inheriting _2_Person, with additional fields

public class _2_Employee extends _2_Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    public _2_Employee() {
        super();
    }

    public _2_Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
