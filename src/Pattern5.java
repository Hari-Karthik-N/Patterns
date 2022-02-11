import java.util.Scanner;

public class Pattern5 {
    static void printPattern(int rows) {
        for(int i = 1, k = 0; i <= rows; i++, k+=2) {
            for(int j = 1, l = k; j <= rows; j++, l++) {
                System.out.print(((j+l) % (2*rows)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = input.nextInt();
        printPattern(rows);
    }
}
