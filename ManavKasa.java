import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double armutF = 2.14;
        double elmaF = 3.67;
        double domatesF = 1.11;
        double muzF = 0.95;
        double patlicanF = 5.00;

        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);

        System.out.println("Alacağınız ürünlerden kaç kg istediğinizi giriniz: ");
        System.out.print("Armut kg: ");
        armutKg = input.nextInt();

        System.out.print("Elma kg: ");
        elmaKg = input.nextInt();

        System.out.print("Domates kg: ");
        domatesKg = input.nextInt();

        System.out.print("Muz kg: ");
        muzKg = input.nextInt();

        System.out.print("Patlıcan kg: ");
        patlicanKg = input.nextInt();

        double tutar = (armutKg*armutF + elmaKg*elmaF + domatesKg*domatesF + muzKg*muzF + patlicanKg*patlicanF);

        System.out.print("Ödenecek tutar: "+ tutar);

    }
}
