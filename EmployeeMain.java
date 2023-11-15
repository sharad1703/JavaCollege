public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee("Sharad", "Patel",123456.23, 500);
        Employee e2 = new HourlyEmployee("Sharad", "patel", 1234, 15, 35);
        Employee e3 = new CommissionEmploye("Sharad", "Patel", 1234, 0.3, 0.6);
        Employee e4 = new BasePlusComissionEmployee("Sharad", "Patel", 1234, 4500);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());


    }
}
