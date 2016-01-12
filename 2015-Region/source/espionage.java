import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Espionage {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("espionage.dat"));
        int timesRun = scan.nextInt();

        String s; int d; char[] arr; String si = "";

        for(int i = 0; i < timesRun; i++) {
            s = scan.next(); d = scan.nextInt(); si = "";
            arr = s.toCharArray();

            for(char c : arr) {
                si += (int) c;
            }

            System.out.println(new BigInteger(si).mod(BigInteger.valueOf(d)).toString());
        }
    }
}
