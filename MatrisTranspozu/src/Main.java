import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Column Number : ");
        int column = input.nextInt();

        System.out.print("Row Number : ");
        int row = input.nextInt();

        int[][] matris = new int[column][row];

        System.out.println("Matris ");

        int value = 1;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < row; j++) {
                matris[i][j] = value;
                value++;
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] transpozMatris = new int[row][column];

        System.out.println("---------");
        System.out.println("Transpoze ");

        for (int i = 0; i < transpozMatris.length; i++) {
            for (int j = 0; j < transpozMatris[i].length; j++) {
                transpozMatris[i][j] = matris[j][i];
                System.out.print(transpozMatris[i][j] + "  ");
            }
            System.out.println();
        }
    }
}