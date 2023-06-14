package exercisesChapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> tenRandomNums = new ArrayList<Integer>();
        tenRandomNums.add(23);
        tenRandomNums.add(1);
        tenRandomNums.add(12);
        tenRandomNums.add(45);
        tenRandomNums.add(17);
        tenRandomNums.add(98);
        tenRandomNums.add(78);
        tenRandomNums.add(35);
        tenRandomNums.add(3);
        tenRandomNums.add(84);
        System.out.println(tenRandomNums);
    }
//   not right, fix later
//
//    public static int sumEven(ArrayList<tenRandomNums> arr) {
//        int total = 0;
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//    }




}
