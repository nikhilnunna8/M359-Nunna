import java.io.File;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws java.io.FileNotFoundException {

        File myFile = new File("oneSchedule.txt");
        Scanner scan = new Scanner(myFile);
        Student[] students = new Student[scan.nextInt()];
        scan.nextLine();
        //Making the student

        for (int x = 0; x < 8; x++) {
            String stuName = scan.nextLine();
            Course[] stuCourses = new Course[8];
            for (int i = 0; i < 8; i++) {
                String teacher = scan.nextLine();
                String course = scan.nextLine();
                String grade = scan.nextLine();
                int period = scan.nextInt();
                if (scan.hasNextLine()) {
                    scan.nextLine();//dummy read to get rid of \n character
                }
                stuCourses[i] = new Course(teacher, course, grade, period);
                }
            students[x] = new Student(stuName, stuCourses);
        }
        printAllStudentSchedules(students);
    }

    /**
     * prints all the students in the array and separates each student with a line
     * @param allStudents
     */
    public static void printAllStudentSchedules(Student[] allStudents){
        for (Student i: allStudents){
            if (i != null){
                System.out.println(i);
                System.out.println();
            }
        }
    }
}
