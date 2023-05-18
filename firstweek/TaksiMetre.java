import java.util.Scanner;
/*
  Taksimetre Programı
   Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

   Taksimetre KM başına 2.20 TL tutmaktadır.
   Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
   Taksimetre açılış ücreti 10 TL'dir.
 */
public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20 , total;
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = scan.nextInt();

        total = 10 + km * perKm;

        System.out.println("Toplam tutar : " + ((total < 20) ? 20 : total));



    }
}