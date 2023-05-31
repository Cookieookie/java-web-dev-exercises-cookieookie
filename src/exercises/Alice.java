package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence;
        firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(firstSentence);
        System.out.println("What term within this sentence do you want to find? ");
        String searchTerm = input.nextLine();

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        if (firstSentence.toLowerCase().contains(searchTerm)) {
            System.out.println("Yes! that term is in the sentence!: " + searchTerm + "first appears at index " + index + " and is " + length + " characters long.");
            String modifiedSentence = firstSentence.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Sorry, that term is not in the sentence" + searchTerm);
        }
    }
}
