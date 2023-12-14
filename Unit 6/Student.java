public class Student {
    String name;
    Course[] myClasses = new Course[8];

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
    public String toString(){
        String out = "";
        out+="Student Name: " + this.name + "\n";
        for (Course i: myClasses){
            out += i + "\n";
        }
        return out;
    }
}
