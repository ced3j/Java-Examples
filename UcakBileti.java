import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args){
        System.out.println("---Uçak Bileti Ücretini Hesaplayan Program---");

        int yas, mesafe, yolculukTipi;
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("\n1=> Tek Yön\n2=> Gidiş-Dönüş\nYolculuk türünüz: ");
        yolculukTipi = input.nextInt();

        if(yas > 0 && mesafe > 0){
            if((yolculukTipi == 1) || (yolculukTipi == 2)) {
                tutar = mesafe * 0.10;
                if(yas < 12 && yas > 0){
                    tutar = tutar/2;
                }else if(yas >= 12 && yas < 24){
                    tutar = tutar * 0.90;
                }else if(yas >= 65){
                    tutar = tutar * 0.70;
                }

                if(yolculukTipi == 2){
                    tutar = tutar * 0.80;
                    System.out.println("Ödenecek tutar: "+ tutar*2);
                }
                else{
                    System.out.println("Ödenecek tutar: "+ tutar);
                }

            }else{
                System.out.println("Hatalı veri girdiniz!");
            }
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
