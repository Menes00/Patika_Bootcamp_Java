import java.util.Scanner;
/*
  Vücut Kitle İndeksi Hesaplama
  Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

  Formül
  Kilo (kg) / Boy(m) * Boy(m)
 */
public class BMI {
    public static void main(String[] args) {
        double height , weight,bmi;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = scan.nextDouble();

        bmi = weight /(height*height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);

    }
}