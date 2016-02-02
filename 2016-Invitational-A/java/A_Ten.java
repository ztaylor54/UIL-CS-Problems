/*SOLVED by Zachary Taylor (ztaylor54)*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Ten {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("a_ten.dat"));

        ArrayList<Integer> divisors = new ArrayList<>();
        ArrayList<Integer> abundantNumbers = new ArrayList<>();

        int current;
        while (scan.hasNextInt()) {
            current = scan.nextInt();
            for (int x = 0; x < current; x++) { //go through each number
                for (int i = 1; i < x; i++) {
                    if (x % i == 0)
                        divisors.add(i);
                }
                int sum = 0;
                for (int z : divisors)
                    sum += z;
                if (sum > x)
                    abundantNumbers.add(x);
                divisors.clear();
            }
            int max = 0;
            for (int y : abundantNumbers)
                if (y > max)
                    max = y;
            System.out.println(max);
            abundantNumbers.clear();
            divisors.clear();
        }
    }
}
