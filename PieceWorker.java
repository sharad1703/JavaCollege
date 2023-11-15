public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    PieceWorker(String firstName, String lastName, double securityNumber, double wage, int pieces){
        super(firstName, lastName, securityNumber);
        if (wage<0){
            System.out.println("Wage cannot be less than zero, Please enter valid Wage.");
        }
        this.wage = wage;
        if (pieces<0){
            System.out.println("Amount of pieces cannot be less than zero, please enter valid amount.");
        }
        this.pieces = pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings(){
        return wage*pieces;
    }

    @Override
    public String toString(){
        return "Total Earnings is:" + earnings() + ", for wage:" + wage + " and pieces: " + pieces;
    }
}
