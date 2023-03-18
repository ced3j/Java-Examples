import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        int a, b; // Dik üçgenin a ve b kenarı
        double c; // Hipotenüs


        // Kullanıcıdan verileri alıyoruz
        Scanner input = new Scanner(System.in);

        System.out.print("A kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("B kenarını giriniz: ");
        b = input.nextInt();

        // c*c = a*a + b*b;  // c'nin karesi a kare + b kare'ye eşit olduğu için bunu bulmaya çalışıyoruz
        // Fakat programda C'yi bulmamız gerek
        // O yüzden math.sqrt fonksiyonu ile içine girilen sayının karekökünü alabiliyoruz
        // Bu sayede c'yi buluyoruz
        c = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenüs: "+c);

    }
}
