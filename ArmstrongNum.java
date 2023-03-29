import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Armstrong sayı tespit eden program");
        System.out.print("Test etmek istediğiniz sayıyı giriniz: ");
        Scanner input = new Scanner(System.in);
        int num, k, armstrong, toplam = 0;
        // k burada üs olarak belirlenen sayı olacak


        num = input.nextInt();
        armstrong = num;
        k = String.valueOf(num).length();
        // String.valueOf() metodu ile sayı string'e dönüştürülür ve
        // length() metodu ile string'in uzunluğu hesaplanarak basamak sayısı bulunur.


        while (num != 0) {
            int basamak = num % 10;
            int total = 1;
            for (int i = 1; i <= k; i++) {
                total *= basamak;
            }
            toplam += total;
            num /= 10;
        }

        if (toplam == armstrong) {
            System.out.println(armstrong + " Armstrong sayıdır");
        } else {
            System.out.println(armstrong + " Armstrong sayı değildir");
        }


    }
}


/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);



    }
}
*/