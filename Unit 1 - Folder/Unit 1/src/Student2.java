public class Student2 {

    private String name;
    private int gradeLevel;
    private double gpa;

    public Student2(String n, int grade, double g){
        name = n;
        gradeLevel = grade;
        gpa = g;

    }
    public Student2(String n){
        name = n;
        gradeLevel = 9;
        gpa = -1;
    }

    public String getName(){
        return name;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public double getGPA(){
        return gpa;
    }

    public void setGPA(double g){
        gpa = g;
    }

    public void addYear(){
        gradeLevel++;
    }

    public String toString(){
        String data = "";
        data += "Name: " + name;
        data += "\nGrade Level: " + gradeLevel;
        data += "\nGPA: " + gpa;
        return data;
    }

}