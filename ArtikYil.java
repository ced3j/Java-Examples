import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){
        System.out.println("Artık Yıl Hesaplayan Program");

        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        if(yil%4==0){
            System.out.println(yil+" bir artık yıldır.");
        }
        else if(yil%100==0 && yil%400==0){
            System.out.println(yil+ "bir artık yıldır.");
        }
        else{
            System.out.println(yil+" bir artık yıl değildir.");
        }

    }
}
