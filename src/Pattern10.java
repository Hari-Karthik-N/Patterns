import java.util.Scanner;

public class Pattern10 {
    static void printPattern(int rows) {
        int toPrint = 2;
        for(int i = 1; i <= rows; i++) {
            for(int j = i; j <= rows; j++) System.out.print(" ");
            for(int j = 1; j <= toPrint; j++) {
                System.out.print("*");
            }
            toPrint += 4;
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