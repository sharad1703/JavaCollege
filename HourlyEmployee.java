public class HourlyEmployee extends Employee {

    public double extraWage;
    public double extra;
    public double wage;
    public double hours;

    public HourlyEmployee(String firstName, String lastName, double securityNumber, double wage, double hours){
        super(firstName, lastName, securityNumber);
        if (wage>0){
            this.wage = wage;
        }
        else{
            throw new IllegalArgumentException("Invalid input");
        }
        if (hours>0 && hours<168){
            this.hours = hours;
        }
        else{
            throw new IllegalArgumentException("Your hours cannot be more than 168");
        }
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public double earnings(){
        if (hours < 40){
            return  wage* hours;
        } else {
            extra = hours - 40;
            extraWage = wage+ (wage/2);
            return (40*wage) + (extra*extraWage);
        }
    }

    public String toString(){
        return "Hourly wage of " + firstName + "is " + wage + " while monthly salry of employee is " + earnings();
    }
}
