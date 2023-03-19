import java.sql.SQLOutput;
import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        int hak = 5;

        while(hak != 0){
            String userName, password;

            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if(userName.equals("betel") && password.equals("jesedes")){
                System.out.println("Giriş yaptınız...");
                break;
            }
            else {
                System.out.println("Girdiğiniz bilgiler yanlış!");
                hak--;
                System.out.println("Kalan hakkınız: " + hak + "\n");

            }
        }

        if(hak == 0){
            System.out.println("Haklarınız tükendi! Sistemden atılıyorsunuz...");
        }


    }
}
