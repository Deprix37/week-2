import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i<list.length; i++){
            System.out.print(i+1 + ". Elemanı: ");
            list[i] = input.nextInt();

        }
        Arrays.sort(list);
        System.out.print("Sıralama: ");
        for (int eleman : list) {
            System.out.print(eleman + " ");
        }


    }
}