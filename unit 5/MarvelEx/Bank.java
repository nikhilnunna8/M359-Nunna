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

        System.out.print("What is your Monthly Salary: ");
        double salaryAmt = scan.nextDouble();
        Customer cust1 = new Customer(name, salaryAmt, custr);
        scan.nextLine();
        int totMonths = 0;
        while(true){
            System.out.print("Do you want to deposit(y is yes): ");

            String y = scan.nextLine();
            if(y.equals("y")){
                System.out.print("How much do you wanna deposit(has to be int): ");
                int depnum = scan.nextInt();
                custr.deposit(depnum);
                scan.nextLine();
            }
            System.out.println();
            System.out.print("Do you want to go forward a month(y is yes): ");
            String monthly = scan.nextLine();
            if(monthly.equals("y")){
                custr.addSalary(cust1);
                totMonths +=1;
            }
            if(totMonths % 12 == 0){
                int x = totMonths/12;
                custr.afterInterest(x);
            }
            System.out.print("Do you want to end(y is yes): ");
            String end = scan.nextLine();
            if (end.equals("y")){
                statement(cust1);
                break;
            }
        }
    }
    public static void statement(Customer c1){
        System.out.println(c1);

    }
}
