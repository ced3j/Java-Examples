import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        int km, startPrice = 10;
        double total, perKm = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total = (km * perKm) + startPrice;


        total = (total < 20) ? 20 : total; // total 20 tlden küçükse total'i 20'ye eşitle
        // eğer küçük değilse total'i yukarıda hesapladığımız sonuç olarak tanımla

        System.out.print("Ödenecek tutar: "+total);


    }
}
