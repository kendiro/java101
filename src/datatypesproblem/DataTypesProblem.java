package datatypesproblem;

import java.util.*;
import java.io.*;

public class DataTypesProblem {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                double intBeginingValue = Math.pow(2, 31) * -1;
                double intEndingValue = Math.pow(2, 31) - 1;

                double longBeginingValue = Math.pow(2, 63) * -1;
                double longEndingValue = Math.pow(2, 63) - 1;

                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= intBeginingValue && x <= intEndingValue) {
                    System.out.println("* int");
                }
                if (x >= longBeginingValue && x <= longEndingValue) {
                    System.out.println("* long");
                }
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
