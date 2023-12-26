import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int sayi = input.nextInt();
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int minShort = sayi;
        int maxShort = sayi;
        Arrays.sort(list);
        for (int i : list) {
            if (sayi>= i) {
                minShort = i;
            }
            else if (sayi < i) {
                maxShort = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı :  " + minShort);
        System.out.println("Girilen sayıdan Büyük en yakın sayı :  " + maxShort);


    }
}