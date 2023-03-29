import java.util.Scanner;
public class Katlar {
    public static void main(String[] args){
        System.out.println("Girilen sayıya kadar 4ve5'in kuvvetlerini ekrana yazdıran program");
        int n;
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 0; i<= n; i++){
            if(i%4==0 && i%5==0){
                System.out.println(i);
            }
        }



    }
}
