package MarvelEx;

public class Account {
    private int genAccountNum;
    private double balance;
    public double getBalance() {
        return balance;
    }
    public Account(double balance){
        genNum();
        this.balance = balance;
    }
    /**
     * Gets a random number from 100000 to 899999 inclusive and sets it to genAccountNum
     */
    public void genNum(){
        genAccountNum = (int)(Math.random()*800000+100000);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Adds a deposit amount to the balance.
     * @param deposit The amount to deposit into the balance (must be a double number that is greater than or equal to 0)
     */
    public void deposit(double deposit) {
        balance += deposit;
    }
    /**
     * Adds the salary from the Customer object to the balance.
     * @param salary: Attribute of a customer object that contains the monthly salary.
     */
    public void addSalary(Customer salary) {
        balance += salary.getSalary();
    }
    public int getGenAccountNum() {
        return genAccountNum;
    }
    /**
     * Calculates the compounded balance after a given amount of years using a set interest variable.
     * @param years the given amount of int years you want to get interest for.
     * @return returns the balance
     */
    public double afterInterest(int years){
        for (int i = 0; i < years; i++) {
            balance += balance * Customer.INTEREST;
        }
        return balance;
    }
}

