public class Question {
String trivia, c1, c2, c3, c4, answer;
int point;

public Question(String trivia, String c1, String c2, String c3, String c4, String answer, int point) {
    this.trivia = trivia;
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
    this.c4 = c4;
    this.answer = answer;
    this.point = point;
}
    public String getTrivia() {
        return trivia;
    }
    public void setTrivia(String trivia) {
        this.trivia = trivia;
    }
    public String getC1() {
        return c1;
    }
    public void setC1(String c1) {
        this.c1 = c1;
    }
    public String getC2() {
        return c2;
    }
    public void setC2(String c2) {
        this.c2 = c2;
    }
    public String getC3() {
        return c3;
    }
    public void setC3(String c3) {
        this.c3 = c3;
    }
    public String getC4() {
        return c4;
    }
    public void setC4(String c4) {
        this.c4 = c4;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }

    /**
     *  Gets the questions and potential answers of a trivia question and formats it.
     * @return a String containing the formatted question
     */
    public String toString(){
        String out = "";
        out += this.getTrivia() + "\n";
        out += this.getC1() + "\n";
        out += this.getC2() + "\n";
        out += this.getC3() + "\n";
        out += this.getC4() + "\n";
        return out;
    }
}
