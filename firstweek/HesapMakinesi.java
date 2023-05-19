import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int num1,num2,select;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        num1 = scan.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz : ");
        select = scan.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplama Sonucu : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma Sonucu : " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölme Sonucu : " + (num2 != 0 ? (num1 / num2 ) : "Bir sayı 0'a bölünemez"));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız!");
        }
    }
}