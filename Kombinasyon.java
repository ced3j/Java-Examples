// 🔘 🔴 🟠 🟡 🟢 🔵 🟣 ⚫️ ⚪️ 🟤

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Kombinasyonunu bulmak istediğiniz değerleri giriniz. ");
        System.out.print(" n: ");
        int n = input.nextInt(), nFaktoriyel = 1, rFaktoriyel = 1, xFaktoriyel = 1;
        System.out.print(" r: ");
        int r = input.nextInt();
        int x = n-r;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        for (int j = 1; j <= r; j++) {
            rFaktoriyel *= j;
        }

        for (int z = 1; z <= x; z++) {
            xFaktoriyel *= z;
        }

        int sonuc = nFaktoriyel / (rFaktoriyel * xFaktoriyel);
        System.out.print("C"+ "(" + n + "," + r + ")" + " = " + sonuc);
    }
}
