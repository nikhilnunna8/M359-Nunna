import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        TriviaGame engine = new TriviaGame();
        Question[] questions = engine.fillQuestions();
        boolean isPlaying = true;
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + " to US History Trivia, where you will be presented with US history questions from the Reconstruction Era" +
                ". You will need to enter in the letter of the answer you wish to select and " +
                "after each question you will be able to see your stats. \n");
        String numsList = "";
        int rand = (int)(Math.random()*12);
        String x = "" + rand;
        for (int i = 0; i < 12; i++) {
            if (isPlaying) {
                while (numsList.indexOf(x) != -1){
                    rand = (int)(Math.random()*12);
                    x = "" + rand;
                }
                System.out.println(questions[rand]);
                numsList+=x;
                String ans = scan.nextLine();
                engine.qRight(questions[rand], ans);
                System.out.println("Do you want to continue playing? (Enter yes or no case isn't required)");
                isPlaying = checkInterest(scan.nextLine());
            }
            if ((!isPlaying) || (i == 11)){
                gameEnd();
                break;
            }
        }
    }

    /**
     * Returns whether if the player want to continue playing or not and uses a String input from the player that can have
     * any case.
     * @param input a String containing either yes or no with any case that is inputted by the player.
     * @return returns a boolean containing whether the player wants to continue playing or not.
     */
    public static boolean checkInterest(String input){
        String formattedInput = input.toLowerCase();
        if (formattedInput.equals("yes")){
            return true;
        }
        return false;
    }

    /**
     * This function displays the final stats of the player in this game. It displays the total points earned, percent of questions right,
     * number of questions right, and highest streak of correct answers.
     */
    public static void gameEnd(){
        System.out.println("You earned in total of " + TriviaGame.pointsEarned + " points.\n");
        System.out.println("Your highest correct answer streak was " + TriviaGame.pointsStreak2 + " questions.\n");
        double percentCorrect = 0;
        percentCorrect = (double)(TriviaGame.numQuestionsRight)/(TriviaGame.numQuestionsWrong + TriviaGame.numQuestionsRight);
        percentCorrect *= 100;
        System.out.println("You got " + TriviaGame.numQuestionsRight + " questions right.\n");
        System.out.println("Which means that you got " + percentCorrect + "% correct.\n");
    }
}
