package MarvelEx;

public class Customer {
    private String name;
    private Account accounts;
    public static final double INTEREST = 0.012;
    private double salary;
    public Customer(String n, double s, Account x){
        name = n;
        salary = s;
        accounts = x;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public Account getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts = accounts;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        String output = "";
        output += "Name: " + name;
        output += "\nSalary: " + salary;
        output += "\nAccount Balance: " + accounts.getBalance();
        return output;
    }
}
