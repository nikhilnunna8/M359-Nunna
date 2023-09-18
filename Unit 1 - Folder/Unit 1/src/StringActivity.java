import java.util.Scanner;
public class StringActivity {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a phrase: ");
        String phrase = scan.nextLine();

        System.out.print("What character number do you want: ");
        int charNum = scan.nextInt();
        System.out.print("Character " + charNum + " is: " + phrase.substring((charNum - 1), charNum) + "\n");

        System.out.print("Please enter another phrase: ");
        scan.nextLine();
        String phraseSecond = scan.nextLine();

        System.out.print("Comparing the two strings: " + phrase.compareTo(phraseSecond) + "\n");

        String combined = phrase.concat(phraseSecond);
        System.out.print("Concatinating the two strings: " + combined + "\n");

        String phraseUpper = phrase.toUpperCase();
        String phraseSecondUpper = phraseSecond.toUpperCase();
        System.out.print("Are the two strings equal (case sensitive): " + phrase.equals(phraseSecond) + "\n");
        System.out.print("Are the two strings equal (not case sensitive): " + phraseUpper.equals(phraseSecondUpper) + "\n");

        System.out.print("What letter are you looking for in the first phrase: ");
        String letter = scan.nextLine();
        System.out.print(letter + " first occurs at: " + phrase.indexOf(letter) + "\n");

        System.out.print("What letter do you want replaced with the letter x: ");
        String replacement = scan.nextLine();
        System.out.print("The new string is: " + phrase.replace(replacement, "x") + "\n");

        System.out.print("What substring do you want (put a space and comma between the number): ");
        String x = scan.nextLine();
        String x1 = x.substring(0, 1);
        String x2 = x.substring(3);
        int z = Integer.parseInt(x1);
        int z2 = Integer.parseInt(x2);
        System.out.print(z2);
        System.out.print("Substring returned: " + phrase.substring(z, z2) + "\n");

        System.out.print("Starting at what number do you want to start a substring that goes to the end: ");
        int y = scan.nextInt();
        System.out.print(phrase.substring(y) + "\n");

        System.out.print(phraseUpper + "\n");
        System.out.print(phraseUpper.toLowerCase() + "\n");




    }
}
