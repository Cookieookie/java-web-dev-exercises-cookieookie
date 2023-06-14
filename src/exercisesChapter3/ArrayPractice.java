package exercisesChapter3;
import java.util.Scanner;

public class ArrayPractice {
    Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i: integerArray) {
            if (i % 2 != 0) { //modified to print odd
                System.out.println(i);
            }
        }
    }
}
