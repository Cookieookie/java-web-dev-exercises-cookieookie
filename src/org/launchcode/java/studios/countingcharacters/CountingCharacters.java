package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        // bonus mission 1 - Prompt the user to enter the  string in the command line
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase you would like to count: ");
        String quote = input.next();

//        String quote="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Map <Character, Integer>charMapCount = new HashMap<>();

        for(Character letter : quote.toLowerCase().toCharArray()) { // bonus mission 2 - added .toLowerCase() to make case-insensitive.

            if(charMapCount.containsKey(letter)) {
                charMapCount.put(letter, charMapCount.get(letter) + 1);
            } else {
                charMapCount.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charMapCount.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

// from previous KC class - does not work
//public class CountingCharacters {
//    public static void main (String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String quote ="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//
//        char[] charactersInString = quote.toCharArray();
//        HashMap<Character, Integer> letterCounts = new HashMap<>();
//
//        for (char letter: charactersInString) {
//            if (letterCounts.containsKey(letter)) {
//                letterCounts.put(letter, 1);
//            } else {
//                letterCounts.computeIfPresent(letter,
//                (key, val) -> val + 1);
//
//                 letterCounts.put(letter,letterCounts.get(letter) + 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> lettersEntry: letterCounts.entrySet()) {
//            System.out.println(lettersEntry.getKey() + ": " + lettersEntry.getValue());
//        }
//    }
//}
