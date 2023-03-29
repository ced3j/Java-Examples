import java.util.Scanner;
public class TekSayilar {
    public static void main(String[] args){
        System.out.println("Tek bir sayı girilene kadar girilen değerlerden " +
                "çift olanları ve 4ün katı olanları toplayan program");
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);



        do{
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if( (n%2==0) && (n%4==0)){
                total += n;
            }
        }while(n%2==0);

        System.out.println("Toplam: "+total);

    }
}
