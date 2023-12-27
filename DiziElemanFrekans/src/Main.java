import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            int frekans = 0;
            while (i < list.length - 1 && list[i] == list[i + 1]) {
                frekans++;
                i++;
            }
            frekans++;
            System.out.println(list[i] + " Sayısı " + frekans + " kere tekrar edildi");
        }

    }
}