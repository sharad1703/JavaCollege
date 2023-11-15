public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Sharad", "Patel", 12345678, 500.00);
        employees[1] = new PieceWorker("Priya", "Patel", 123456789, 50.46, 15);
        employees[2] = new HourlyEmployee("Yash", "Patel", 12355578, 50.00, 40);
        employees[3] = new PieceWorker("Arha", "Patel", 12344478, 26.35, 32);

        for (Employee employee : employees) {
            System.out.println(  employee.toString());
            System.out.println();
        }
    }
}
