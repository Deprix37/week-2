import java.util.Scanner;

public class Main {
    static int power(int base, int exponent){ // base taban , exponent üs
        Scanner input = new Scanner(System.in);

        if(exponent<0){ //üs değerim 0 ın altına düştüğünde recursive Metodu
            int tempExponent = -exponent;
            return 1/(base * power(base,(tempExponent-1)));
        }
        else if (exponent>0){ //üs değerim 0 üstünde  olduğunda recursive Metodu
            return base * power(base, (exponent-1));
        }else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değeri giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        int exponent = input.nextInt();
        System.out.println(("Sonuç: ") + power(base,exponent));

    }
}