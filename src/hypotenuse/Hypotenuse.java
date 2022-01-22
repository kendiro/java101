package hypotenuse;

import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        int a,b;
        double hypotenuse;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first side length:");
        a = input.nextInt();
        System.out.print("Input second side length:");
        b = input.nextInt();

        hypotenuse = Math.sqrt((a*a) + (b*b));
        System.out.print("Hypotenuse = " + hypotenuse);
    }
}
