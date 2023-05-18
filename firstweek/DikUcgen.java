import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        a = scan.nextInt();

        System.out.print("2. Kenarı giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println("c kenarının uzunluğu : " + c);



    }
}