public class CommissionEmploye extends Employee {
    public double grossSales;
    public double commissionRate;

    CommissionEmploye(String firstName, String lastName, double securityNumber, double grossSales, double commissionRate ){
        super(firstName, lastName, securityNumber);

        if (commissionRate>0 &&  commissionRate<1){
            this.commissionRate = commissionRate;
        }
        else {
            throw new IllegalArgumentException("Invalid commission rate");
        }
        if (grossSales<0){
            throw new IllegalArgumentException("Invalid gross sales");
        }
        else {
            this.grossSales = grossSales;
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    public String toString(){
        return "Commission rate of" + firstName + " is " + commissionRate + " while gross sales were " + grossSales + " and in total all accounts for" + earnings();
    }

}
