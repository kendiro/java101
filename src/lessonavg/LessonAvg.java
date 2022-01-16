package lessonavg;

import java.util.Scanner;

public class LessonAvg {

    public static void main(String[] args) {

        int lesson1, lesson2, lesson3, lesson4, lesson5, lesson6;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Lesson 1 Note: ");
        lesson1 = input.nextInt();
        System.out.print("Input Lesson 2 Note: ");
        lesson2 = input.nextInt();
        System.out.print("Input Lesson 3 Note: ");
        lesson3 = input.nextInt();
        System.out.print("Input Lesson 4 Note: ");
        lesson4 = input.nextInt();
        System.out.print("Input Lesson 5 Note: ");
        lesson5 = input.nextInt();
        System.out.print("Input Lesson 6 Note: ");
        lesson6 = input.nextInt();

        double result = (lesson1 + lesson2 + lesson3 + lesson4 + lesson5 + lesson6) / 6;
        if (result > 60) {
            System.out.println("Avg over 60 : " + result);
        } else {
            System.out.println("Avg below 60: " + result);
        }

    }
}
