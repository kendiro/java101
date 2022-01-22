package circle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double field, perimeter;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz : ");
        r = input.nextInt();

        field = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.println("Alan: " + field );
        System.out.println("Çevre: " + perimeter);
    }
}
