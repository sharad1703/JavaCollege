public class SalariedEmployee extends Employee {
    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double securityNumber, double weeklySalary) {
        super(firstName, lastName, securityNumber);
        if (weeklySalary>0.0){
            this.weeklySalary = weeklySalary;
        }
        else {
            throw new IllegalArgumentException ("Invalid input");
        }
    }
    public double getWeeklySalary(){
            return weeklySalary;
    }

    public double earnings(){
        return weeklySalary;
    }

    public String toString(){
        return "Earnings of " + firstName + " is " + weeklySalary + " on weekly basis.";
    }

}
