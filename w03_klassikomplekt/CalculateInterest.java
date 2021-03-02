public class CalculateInterest {
    double newinterest;

    public CalculateInterest(double balance, double interestRate, double period) {
        newinterest = balance * interestRate * period; //tegemist on lambi valemiga, periood = aastad
    }
    public double getInterest() {
       return newinterest;
    }
}

