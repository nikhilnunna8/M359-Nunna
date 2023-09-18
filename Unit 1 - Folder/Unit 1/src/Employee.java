public class Employee {
    private String employeeName;
    private int hoursWorked;
    private double payRate;
    private double federalRate;
    private double stateRate;

    public Employee(String n, int hrs, double pr, double fedTax, double stateTax){
        employeeName = n;
        hoursWorked = hrs;
        payRate = pr;
        federalRate = fedTax;
        stateRate = stateTax;
    }
    public double getGrossPay(){
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }
    public void printPayroll(double gPay){

        System.out.println("\nEmployee's Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + gPay);
        double x = (federalRate/100) * gPay;
        double y = (stateRate/100) * gPay;
        System.out.println("Federal Withholding(" + federalRate + "): " + x);
        System.out.println("State Withholding(" + stateRate + "): " + y);
        System.out.println("Total Deduction: " + (x + y));
        System.out.println("Net Pay: " + (gPay - (x + y)));
    }
    
}
