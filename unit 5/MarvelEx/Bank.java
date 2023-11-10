package MarvelEx;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
// make while loop in a static method, call simulate with parameters, we also need to use account number.
// To access your account you need to put your account number, account number will only be displayed once
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
        boolean x = true;
        System.out.print("To See Bank Statement, What Is Your Account Number: ");
        int acNum = scan.nextInt();
        scan.nextLine();
        int count = 0;
        while(x){
            if(statement(cust1, custr, acNum)){
                System.out.println(cust1);
            }
            else{
                count +=1;
                System.out.println("You have " +(3-count) + " chances left.");
                if(count == 3){
                    System.out.print("Your Account is locked.");
                    x = false;
                }
            }
        }



        }

    public static boolean statement(Customer c1, Account a1, int acNum){
        if(a1.getGenAccountNum() == acNum){
            return true;
        }
        return false;

    }
    public static void simulateYear(int year, double max, double min, Customer c1, Account a1){
        for(int i = 0; i < year*12; i++){
            int depo = (int)(Math.random()*(max-min+1) + min);
            a1.deposit(depo);
            a1.addSalary(c1);
            if(i%12 ==0){
                a1.afterInterest(i/12);
            }

        }

    }
}
