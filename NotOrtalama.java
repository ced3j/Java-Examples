import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {

        int mat, fiz, kim, tur, tar, muz;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.println("----Not Ortalaması Hesaplayan Program----");

        System.out.print("Matematik dersi notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik dersi notunuzu giriniz: ");
        fiz = input.nextInt();

        System.out.print("Kimya dersi notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe dersi notunuzu giriniz: ");
        tur = input.nextInt();

        System.out.print("Tarih dersi notunuzu giriniz: ");
        tar = input.nextInt();

        System.out.print("Müzik dersi notunuzu giriniz: ");
        muz = input.nextInt();

        ort = (mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("Ortalama: "+ort);

        boolean durum = (ort >= 60);

        String sonuc = durum ? "Geçti" : "Kaldı";
        System.out.print(sonuc);

    }
}