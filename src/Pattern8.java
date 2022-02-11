import java.util.Scanner;

public class Pattern8 {
    static void printPattern(int rows) {
        if(rows >= 1)  {
            System.out.println("1");
        }
        int j = 2;
        for(int i = 2; i <= rows; i++) {
            for(int k = 1; k <= i; k++) {
                if(i%2==0) {
                    System.out.print(j + " ");
                    j++;
                } else {
                    System.out.print(j + " ");
                    j--;
                }
            }
            if(((i+1) % 2) == 0) j += (i+1);
            else j += (i);
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
