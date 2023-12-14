import java.util.Scanner;
public class ArrayExe {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String[] seats = new String[3];
        System.out.println("Enter the name of the person to your left.");
        seats[0] = scan.nextLine();
        System.out.println("Enter the name of the person to your right.");
        seats[2] = scan.nextLine();
        System.out.println("Enter your name: ");
        seats[1] = scan.nextLine();

        System.out.println("\nYour row has the following students: ");
        for (int i = 0; i < seats.length; i++){
            System.out.println(seats[i]);
        }
    }
}
    