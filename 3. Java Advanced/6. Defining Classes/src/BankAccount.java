public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    public static int bankAccountCount = 1;
    private int id;
    private double balance;

    BankAccount() {
        this.id = bankAccountCount++;
    }

    public static int getBankAccountCount() {
        return bankAccountCount;
    }

    public int getObjectFromId(int id) {
        return this.id;
    }

    static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
}
