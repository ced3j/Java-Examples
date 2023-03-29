import java.util.Scanner;
public class CiftSayilar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi;
        sayi = input.nextInt();

        for(int i = 0; i<= sayi; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
