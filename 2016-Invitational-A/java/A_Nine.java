/*SOLVED by Zachary Taylor (ztaylor54)*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A_Nine {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("a_nine.dat"));

        int timesRun = scan.nextInt();

        int a, b, larger, smaller;
        for (int i = 0; i < timesRun; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            larger = Math.max(a, b);
            smaller = Math.min(a, b);
            System.out.print(a + b);
            System.out.print(" ");
            System.out.print(Math.abs(a - b));
            System.out.print(" ");
            System.out.print(a * b);
            System.out.print(" ");
            System.out.printf("%.2f", ((double) larger) / ((double) smaller));
            System.out.println();
        }
    }
}
