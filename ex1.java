public class ex1 {
    public static void main(String[] args) {
        Banker.banking();

    }
}
class Banker {
    public static void banking()
    {
        Loan loan1 = new Loan(5.5, 10, 10000);
        Loan loan2 = new Loan(2.0, 5, 80);
        Loan loan3 = new Loan(10.5, 20, 250);

        printLoanInfo(loan1);
        printLoanInfo(loan2);
        printLoanInfo(loan3);

    }

    public static void printLoanInfo(Loan lo)
    {

        System.out.println("Interest rate:" + lo.getAnnualInterestRate());
        System.out.println("Loan years:" + lo.getNumberOfYears());
        System.out.println("Loan amount:" + lo.getLoanAmount());
        System.out.printf("Monthly payment:%.3f\n", lo.getMonthlyPayment());
        System.out.printf("Total payment:%.3f\n", lo.getTotalPayment());
        System.out.println();
    }
}


// Implementation of the Loan class.
// There is no need to edit this code.

class Loan
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /** Construct a loan with specified annual interest rate,
     number of years and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}