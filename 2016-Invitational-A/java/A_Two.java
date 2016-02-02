/*SOLVED by Jacqui Deans (jdeans289)*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A_Two {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("a_two.dat"));
        while (scan.hasNext()) {
            int num = scan.nextInt();
            int twin1 = 0, twin2 = 0;
            for (int i = 3; i < num - 2; i++) {
                if (isPrime(i) && isPrime(i + 2)) {
                    twin1 = i;
                    twin2 = i + 2;
                }
            }
            System.out.println(twin1 + " " + twin2);
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
