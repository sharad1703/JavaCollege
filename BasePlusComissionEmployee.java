public class BasePlusComissionEmployee extends Employee {
    public double baseSalary;

    BasePlusComissionEmployee(String firstName, String lastName, double securityNumber, double baseSalary){
        super(firstName, lastName, securityNumber);
        if (baseSalary>0){
            this.baseSalary = baseSalary;
        }
        else {
            throw new IllegalArgumentException("Base salary should be greater than 0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings(){
        return baseSalary;
    }

    public String toString(){
        return "Base salary of " + firstName + " is " + baseSalary;
    }
}
