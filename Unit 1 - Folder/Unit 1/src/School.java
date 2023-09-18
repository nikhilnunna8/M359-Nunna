import java.util.Scanner;

public class School {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Student Grade Level: ");
        int gLevel = scan.nextInt();
        System.out.print("Enter Student's GPA: ");
        double gpa = scan.nextDouble();

        Student2 s1 = new Student2(name, gLevel, gpa);

        System.out.println(s1.getName());
        System.out.println(s1.getGradeLevel());
        Student2 s2 = new Student2("Varsha");
        System.out.println(s1.toString());

        s1.addYear();
        s1.setGPA(3.96);

        System.out.println(s1.toString());
        System.out.println(s2);

    }
}
