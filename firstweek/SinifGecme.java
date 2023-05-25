import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        mat = scan.nextInt();
        mat = (mat < 0 || mat > 100) ? 0 : mat;
        System.out.print("Fizik notunu giriniz : ");
        fizik = scan.nextInt();
        fizik = (fizik < 0 || fizik > 100) ? 0 : fizik;
        System.out.print("Türkçe notunu giriniz : ");
        turkce = scan.nextInt();
        turkce = (turkce < 0 || turkce > 100) ? 0 : turkce;
        System.out.print("Kimya notunu giriniz : ");
        kimya = scan.nextInt();
        kimya = (kimya < 0 || kimya > 100) ? 0 : kimya;
        System.out.print("Müzik notunu giriniz : ");
        muzik = scan.nextInt();
        muzik = (muzik < 0 || muzik > 100) ? 0 : muzik;

        average = (mat + fizik + turkce + kimya + muzik)/5;
        System.out.println("Ortalamanız: "+average);

        if(average > 55)
            System.out.println("Sınıfı geçtiniz.");
        else
            System.out.println("Sınıfta kaldınız.");

        

    }
}