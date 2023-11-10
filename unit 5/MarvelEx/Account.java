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
    public void genNum(){
        genAccountNum = (int)(Math.random()*800000+100000);
    }


    public void deposit(double deposit) {
        balance += deposit;
    }
    public void withdraw(double withdraw) {
        balance -= withdraw;
    }
    public void addSalary(Customer salary) {
        balance += salary.getSalary();
    }
    public int getGenAccountNum() {
        return genAccountNum;
    }
    public double afterInterest(int years){
        for (int i = 0; i < years; i++) {
            balance += balance * 0.012;
        }
        return balance;
    }
}

