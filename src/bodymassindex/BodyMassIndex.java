package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        double kg, length, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        length = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kg = input.nextDouble();

        bodyMassIndex = kg / (length * length);
        System.out.print("Vücut Kitle İndeksiniz : " + bodyMassIndex);

    }
}
