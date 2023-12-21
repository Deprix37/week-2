import java.util.Scanner;

public class Main {

    static boolean isAsal(int number, int divisor) { //metodumu yapıyor number kullanıcının gireceği sayı divisor bölenim
        if (divisor <= 1) {
            return true;       //asal sayılar sadece kendisine ve 1 e bölünür 1 e bölünüyorsa başka bir bölnei yok asaldır
        }
        if (number % divisor == 0) { //bir bböleninden kalan 0 ise asal değildir
            return false;
        }
        return isAsal(number, divisor - 1); // eğer böleninden kalan yoksa divisoru her defasında 1 azalt tekrar döngüye sok
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı giriniz: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " sayısı ASAL değildir !");
        } else {
            if (isAsal(number, number - 1)) {
                System.out.println(number + " sayısı ASALDIR!");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");
            }
        }
    }
}