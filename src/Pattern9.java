import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int value = input.nextInt();
        for(char i = 'A'; value >= 1; value--,i++) {
            System.out.print(i + " ");
        }
    }
}
