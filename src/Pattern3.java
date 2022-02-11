import java.util.Scanner;

public class Pattern3 {
    static void printPattern(int rows) {
        int j = 1;
        for(int i = 1; i <= rows; i++) {
            for(int k = 1; k <= i; k++,j++) {
                System.out.print(j + " ");
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
