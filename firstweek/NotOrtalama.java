import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfından scan objesi oluştur
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = scan.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = scan.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam/6;

        System.out.println("Ortalamanız : " + ortalama);

        // Ortalama 60'dan büyükse "Sınıfı Geçti" küçükse "Sınıfta Kaldı" yazdır
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}