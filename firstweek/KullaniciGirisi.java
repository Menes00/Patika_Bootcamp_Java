import java.util.Scanner;

/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,select,newPassword;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        userName = scan.nextLine();
        System.out.print("Şifreyi Giriniz : ");
        password = scan.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else if(userName.equals("patika") && !(password.equals("java123"))){
            System.out.println("Şifre Yanlış! Şifrenizi Sıfırlamak İster misiniz?");
            System.out.println("Lütfen Evet veya Hayır yazın!");
            select = scan.nextLine();
            if(select.equals("Evet")){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPassword = scan.nextLine();
                if(newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else {
                System.out.println("Şifre oluşturulamadı");
            }
        }else {
            System.out.println("Bilgileriniz Yanlış!");
        }
    }
}