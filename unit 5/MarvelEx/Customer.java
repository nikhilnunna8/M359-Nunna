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
    public double getSalary() {
        return salary;
    }
    /**
     * Returns a string of the c1 object, with the name, salary, and account balance.
     * @return A formatted string with the name, salary, and account balance.
     */
    public String toString(){
        String output = "";
        output += "Name: " + name;
        output += "\nSalary: " + salary;
        output += "\nAccount Balance: " + accounts.getBalance();
        return output;
    }
}
