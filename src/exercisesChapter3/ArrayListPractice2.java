package exercisesChapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> randomWords = new ArrayList<>();
        randomWords.add("Honey");
        randomWords.add("Apple");
        randomWords.add("Orange");
        randomWords.add("Berry");
        randomWords.add("Kiwi");
        randomWords.add("Egg");

// static method to print each word that has exactly 5 characters.
//        for (String i : randomWords) {
//            if (i.length() == 5) {
//                System.out.println(i);
//            }
//        }

        // modified to print only words of the length the user chooses
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String i : randomWords) {
            if (i.length() == numChars) {
                System.out.println(i);
            } else {
                System.out.println("Sorry, there are no words of that length in the array.");
            }
        }
    }
}
