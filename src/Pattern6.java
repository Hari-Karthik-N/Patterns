import java.util.Scanner;

public class Pattern6 {
    static void printPattern(int rows) {
        for(int i = 1; i <= ((2*rows)-1); i++) {
            if(i > rows) {
                for(int j = ((2*rows)-i); j >=1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for(int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
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
