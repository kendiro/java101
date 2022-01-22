package greengrocer;

import java.util.Scanner;

public class GreenGrocer {

    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, bananaPrice = 0.95, tomatoPrice = 1.11, eggplantPrice = 5.00, total;
        int apple, banana, tomato, eggplant, pear;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç kilo?:");
        pear = input.nextInt();
        System.out.print("Elma Kaç kilo?:");
        apple = input.nextInt();
        System.out.print("Domates Kaç kilo?:");
        tomato = input.nextInt();
        System.out.print("Muz Kaç kilo?:");
        banana = input.nextInt();
        System.out.print("Patlıcan Kaç kilo?:");
        eggplant = input.nextInt();
        total = (pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant
            * eggplantPrice);
        System.out.println("Toplam Tutar: " + total + " TL");
    }
}
