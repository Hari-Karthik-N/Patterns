import java.util.Scanner;

public class Pattern7 {
    static void printPattern(int value) {
        int j = 1;
        for(int i = 1; j <= value; i++) {
            for(int k = 1; k <= i && j <= value; k++,j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int value = input.nextInt();
        printPattern(value);
    }
}
