package MarvelEx;

import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        System.out.println("The Interest Rate is: " + Customer.INTEREST);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = scan.nextLine();
        System.out.print("How much do you want your initial deposit to be: ");
        double deposit = scan.nextDouble();
        scan.nextLine();
        Account custr = new Account(deposit);
        System.out.println("This will be the LAST TIME you will see your Account number: " + custr.getGenAccountNum());


        System.out.print("What is your Monthly Salary: ");
        double salaryAmt = scan.nextDouble();
        Customer cust1 = new Customer(name, salaryAmt, custr);
        scan.nextLine();

        System.out.print("Max Deposit: ");
        double maxDep = scan.nextDouble();
        scan.nextLine();
        System.out.print("Min Deposit: ");
        double minDep = scan.nextDouble();
        scan.nextLine();
        System.out.print("How many years do you want to simulate: ");
        int years = scan.nextInt();
        scan.nextLine();
        simulateYear(years, maxDep, minDep,cust1, custr);

        System.out.print("To See Bank Statement, What Is Your Account Number: ");
        int acNum = scan.nextInt();
        scan.nextLine();
        int count = 0;
        while(true){

            if(statement(custr, acNum)){
                System.out.println(cust1);
                System.out.print("How much do you want to withdraw: ");
                double numRem = scan.nextDouble();
                scan.nextLine();
                withdraw(custr, numRem);
                System.out.println(cust1);
                break;
            }
            else{
                count +=1;
                System.out.println("You have " +(3-count) + " chances left.");
                if(count == 3){
                    System.out.print("Your Account is locked.");
                    break;
                }

            }
            System.out.print("To See Bank Statement, What Is Your Account Number: ");
            acNum = scan.nextInt();
            scan.nextLine();
        }
        }
    /**
     * Checks if the given account number matches the generated account number
     *
     * @param a1    The account to check for the account number.
     * @param acNum The account number to compare.
     * @return True if the provided account number matches the generated account number
     */
    public static boolean statement( Account a1, int acNum){
        if(a1.getGenAccountNum() == acNum){
            return true;
        }
        return false;

    }
    /**
     * Simulates the balance for a specified number of years.
     * Deposits a random amount within the given range each month, adds monthly salary,
     * and applies annual interest to the account at the end of each year.
     *
     * @param year The number of years to simulate.
     * @param max The maximum amount for random monthly deposits.
     * @param min The minimum amount for random monthly deposits.
     * @param c1 The customer object to access the salary of the customer.
     * @param a1 The account object to access the balance.
     */
    public static void simulateYear(int year, double max, double min, Customer c1, Account a1) {
        for (int i = 0; i < year * 12; i++) {
            int depo = (int) (Math.random() * (max - min + 1) + min);
            a1.deposit(depo);
            a1.addSalary(c1);
            if (i % 12 == 0) {
                a1.setBalance(a1.afterInterest(i / 12));
            }
        }
    }
    /**
     * Withdraws a specified amount from the given account.
     *
     * @param a1 The account with the balance.
     * @param numWith Withdrawing amount.
     */
    public static void withdraw(Account a1, double numWith){
        double y = a1.getBalance() - numWith;
        a1.setBalance(y);
    }
}
