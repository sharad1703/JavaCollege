abstract public class Employee {
     final String firstName;
     final String lastName;
     final double securityNumber;
     public double earnings;


    Employee(String firstName, String lastName, double securityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }

    final String getFirstName(){
        return firstName;
    }
    final String getLastName(){
        return lastName;
    }
    final double getSecurityNumber(){
        return securityNumber;
    }

    public String toString(){
        return "First name of the person is: " + firstName + ", While last name of the person is: " + lastName + " and the security number is: " + securityNumber;
    }

    abstract double earnings();
}
