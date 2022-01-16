package calculatetax;

import java.util.Scanner;

public class CalculateTax {

    public static void main(String[] args) {
        double price, taxValue = 0.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Input Price: ");
        price = input.nextDouble();

        double value = price * taxValue;
        double valueWithTax = value + price;

        System.out.println("Price: " + price);
        System.out.println("Tax Rate: " + taxValue);
        System.out.println("Tax Value: " + value);
        System.out.println("Price With Tax: " + valueWithTax);
    }
}
