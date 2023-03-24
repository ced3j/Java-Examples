import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args){
        System.out.println("Çin Zodyağı Burç Hesaplama Programı");

        int kalan, dogum;
        System.out.print("Doğum yılınızı giriniz: ");
        Scanner input = new Scanner(System.in);
        dogum = input.nextInt();

        kalan = dogum%12;

        switch (kalan){
            case 0:

                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz: Maymun");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz: Köpek");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz: Domuz");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz: Fare");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz: Öküz");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz: Tavşan");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz: Yılan");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz: At");
                break;
            case 12:
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
                break;
            default:
                System.out.println("Geçersiz bir yıl girmiş olabilirsiniz...");
        }
    }
}
