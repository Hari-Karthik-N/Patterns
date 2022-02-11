import java.util.Scanner;

public class Pattern4 {
        static void printPattern(int rows) {
            for(int i = 1; i <= rows; i++) {
                for(int j = rows; j >= 1; j--) {
                    if(j <= rows-i+1) {
                        System.out.print((rows-i+1) + " ");
                    } else {
                        System.out.print(j + " ");
                    }
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
