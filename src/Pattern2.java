import java.util.Scanner;

public class Pattern2 {
    static void patternPrint(int value) {
        for (int i = 1; i <= ((2 * value) - 1); i++) {
            for (int j = 1; j <= ((2 * value) - 1); j++) {
                if (j > value) {
                    if (i > value) {
                        if (((2 * value) - j) > ((2 * value) - i))
                            System.out.print(((2 * value) - i) + " ");
                        else
                            System.out.print(((2 * value) - j) + " ");
                        continue;
                    }
                    if (((2 * value) - j) > i)
                        System.out.print(i + " ");
                    else
                        System.out.print(((2 * value) - j) + " ");
                } else {
                    if (i > value) {
                        if (j > ((2 * value) - i))
                            System.out.print(((2 * value) - i) + " ");
                        else
                            System.out.print(j + " ");
                        continue;
                    }
                    if (j > i)
                        System.out.print(i + " ");
                    else
                        System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int userInput = input.nextInt();
        patternPrint(userInput);
    }
}
