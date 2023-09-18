import java.util.Scanner;
public class Payroll {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee's Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Number of Hours Worked this Week: ");
        int hours = scan.nextInt();
        System.out.print("Enter Hourly Pay Rate: ");
        double payRate = scan.nextDouble();
        System.out.print("Enter Federal Tax Withholding Rate: ");
        double fedTaxRate = scan.nextDouble();
        System.out.print("Enter State Tax Withholding Rate: ");
        double stateTaxRate = scan.nextDouble();

        Employee e1 = new Employee(name,hours,payRate,fedTaxRate,stateTaxRate);
        double gross = e1.getGrossPay();
        e1.printPayroll(gross);

    }
}
