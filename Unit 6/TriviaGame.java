import java.io.File;
import java.util.Scanner;
public class TriviaGame {
    public static int numQuestionsRight;
    public static int numQuestionsWrong;
    public static int pointsEarned;
    public static int pointsStreak;
    public static int pointsStreak2;
    Question[] questions = new Question[12];
    File myFile = new File("triviaQuestions.txt");

    public TriviaGame() {
        numQuestionsRight = 0;
        numQuestionsWrong = 0;
        pointsEarned = 0;
        pointsStreak = 0;
        pointsStreak2 = 0;

    }

    /**
     * This method goes through the formatted text file with 12 questions and creates a Question class array that stores the attributes.
     * @throws java.io.FileNotFoundException
     */
    public Question[] fillQuestions() throws java.io.FileNotFoundException{
        Scanner s1 = new Scanner(myFile);
        for (int i = 0; i < 12; i++){
            String trivia = s1.nextLine();
            String c1 = s1.nextLine();
            String c2 = s1.nextLine();
            String c3 = s1.nextLine();
            String c4 = s1.nextLine();
            int pts = s1.nextInt();
            s1.nextLine();
            String ans = s1.nextLine();
            questions[i] = new Question(trivia, c1, c2, c3, c4, ans, pts);
        }
        return questions;
    }

    /**
     * Checks if the answer that the player inputted is the same as the correct answer.
     * Then, displays stats about the game like answer streak, correct answer, earned points, total earned points
     * and calculates the highest correct answer question streak.
     * @param q1 a Question class parameter representing the question that we want to get the correct answer from.
     * @param answer a String containing the answer that the player inputted.
     */
    public void qRight(Question q1, String answer){
        if (answer.equals(q1.getAnswer())){
            numQuestionsRight++;
            pointsStreak++;
            if (pointsStreak > pointsStreak2){
                pointsStreak2 = pointsStreak;
            }
            pointsEarned += q1.getPoint();
            System.out.println("That's correct! \n");
            System.out.println("The correct answer is " + q1.getAnswer() + "!\n");
            System.out.println("You earned " + q1.getPoint() + " points.\n");
            System.out.println("You have " + pointsEarned + " total points.\n");
            System.out.println("Your answer streak is " + pointsStreak);
        }
        else{
            numQuestionsWrong++;
            pointsStreak = 0;
            pointsEarned -= q1.getPoint();
            System.out.println("That's incorrect. \n");
            System.out.println("The correct answer was " + q1.getAnswer() + "\n");
            System.out.println("You lost " + q1.getPoint() + " points.\n");
            System.out.println("You have " + pointsEarned + " total points.\n");
            System.out.println("You answer streak has been reset to 0. \n");
        }
    }
    public int getPointsStreak2() {
        return pointsStreak2;
    }

}
