import java.util.Scanner;

/* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        a = scan.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        b = scan.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c = scan.nextInt();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Çevresi : " + 2*u);
        System.out.println("Üçgenin Alanı : " + alan);





    }
}