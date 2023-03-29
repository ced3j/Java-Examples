import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args){
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        double result = 0.0;

        for(int i = 1; i <= x; i++){
            result += (1.0/i);
        }

        System.out.println("Sonuç: "+ result);

    }
}
