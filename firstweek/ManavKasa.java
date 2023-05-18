import java.util.Scanner;
/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total;
        int kgArmut,kgElma,kgDomates,kgMuz,kgPatlican;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        kgArmut = scan.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        kgElma = scan.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        kgDomates = scan.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        kgMuz = scan.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        kgPatlican = scan.nextInt();

        total = armut*kgArmut + elma*kgElma + domates*kgDomates + muz*kgMuz + patlican*kgPatlican;
        System.out.println("Toplam Tutar : " + total + " TL");

    }
}