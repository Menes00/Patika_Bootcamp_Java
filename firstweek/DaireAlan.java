import java.util.Scanner;
/*
  Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

  𝜋 sayısını = 3.14 alınız.

  Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class DaireAlan {
    public static void main(String[] args) {
        int r;
        double pi = 3.14 , a , area;

        Scanner scan = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = scan.nextInt();
        System.out.print("Merkez açısını giriniz : ");
        a = scan.nextDouble();

        area = (pi * r*r * a)/360;
        System.out.println("Dairenin Alanı : " + area);



    }
}