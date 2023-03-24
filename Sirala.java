import java.util.Scanner;
public class Sirala {
    public static void main(String[] args){
        // Kullanıcının girdiği 3 farklı sayıyı küçükten büyüğe sırala
        int n1, n2, n3;


        Scanner input = new Scanner(System.in);

        System.out.println("3 Adet sayı giriniz...");

        System.out.print("Sayı 1: ");
        n1 = input.nextInt();

        System.out.print("Sayı 2: ");
        n2 = input.nextInt();

        System.out.print("Sayı 3: ");
        n3 = input.nextInt();

        if(n1 < n2 && n1 < n3){
            if(n2 > n3){
                System.out.println("n1 < n3 < n2");
            }
            else{
                System.out.println("n1 < n2 < n3");
            }
        }
        else if(n2 < n3 && n2 < n1){
            if(n1 > n3){
                System.out.println("n2 < n3 < n1");
            }
            else{
                System.out.println("n2 < n1 < n3");
            }
        }
        else if(n3 < n1 && n3 < n2){
            if (n2 < n1){
                System.out.println("n3 < n2 < n1");
            }
            else{
                System.out.println("n3 < n1 < n2");
            }
        }


    }
}
