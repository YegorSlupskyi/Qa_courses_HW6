package src;

public class Loan {
    private double amount;
    private double rate;
    private int installments;

    public Loan(double amount, double rate, int installments) {
        this.amount = amount;
        this.rate = rate;
        this.installments = installments;
    }

    public double getInstallmentSize() {
        double totalLoanForThePeriod = amount * Math.pow(1 + rate / 100, installments);
        double installment = totalLoanForThePeriod / installments;

        return installment;
    }


    public String toString() {
        return this.getAmount() + " "
                + this.getRate() + "% "
                + this.getInstallments();
    }


    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double newAmount) {
        this.rate = newAmount;
    }

    public double getInstallments() {
        return this.installments;
    }

    public void setInstallments(double newInstallments) {
        this.rate = newInstallments;
    }
}
