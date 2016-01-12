import java.util.*;
import java.io.*;

public class Fibonacci {

  private static ArrayList<Integer> computed = new ArrayList<>();
  private static int numDuplicates;

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("fibonacci.dat"));
    int timesRun = scan.nextInt();
    for(int i = 0; i < timesRun; i++) {
      numDuplicates = 0;
      computed.clear();
      fibonacci(scan.nextInt());
      System.out.println(numDuplicates);
    }
  }

  public static int fibonacci(int n) {
    if(computed.contains(n)) {
      numDuplicates++;
    } else {
      computed.add(n);
    }
    if(n == 0 || n == 1)
      return n;
    else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
