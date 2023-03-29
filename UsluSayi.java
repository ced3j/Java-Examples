// 🔘 🔴 🟠 🟡 🟢 🔵 🟣 ⚫️ ⚪️ 🟤

import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args){
        int n, k, result = 1;
        // alttaki sayı = n
        // üs = k

        Scanner input = new Scanner(System.in);
        System.out.print("Alttaki sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üstteki sayıyı giriniz: ");
        k = input.nextInt();

        for(int i = 0; i < k; i++){
            result *= n;
        }

        System.out.println("Sonuç: "+result);

    }
}
