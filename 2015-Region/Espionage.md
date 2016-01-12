#Espionage
| Program Name     | Input File      |
|------------------|-----------------|
| `Espionage.java` | `espionage.dat` |

Universal Intercontinental Laminates (UIL) is in the process of developing new polymers, with the different offices accross the globe collaborating on the research. Their competitor, your employer, would love to get their hands on the data, so UIL is being very secretive. One important piece of data is the molecular weight of the large polymer molecules that are being developed. The molecular weight is expressed as an integer. Whenever one research branch of UIL wants to send the molecular weight of a polymer to another branch, they encode that information as a piece of text, i.e. a string of printable ASCII characters. Your employers have intercepted this data. They have also figured out how the molecular weight data is encoded in the text. Your job is to write a program that will do the decoding.

Here is the encryption algorithm. Let `s` be the string that represents the encoded message. Call `si` the representation of the string obtained by replacing each character with the decimal representation of its ASCII calue. For example, if `s="ab"`, then `si="9798"`. Let `i` be the integer value of `si`. In this example, `i = 9798`. You are given another integer `d`, and the molecular weight, is `i % d`. Only printable ASCII characters are used in the encoding, and there are no newlines or tab characters.

##Input
The first line of input is an integer `t`, the number of test cases.
For each test case, there are two line -- the first is a text line `s`, and the next is an integer `d`.

##Output
Print one line for each test case with the molecular weight.

##Example Input File
```shell
3
ab
9798
ab
12194
34508393
9087
```

##Example Output to Screen
```shell
0
9798
8492
```

#Solution
The solution to this problem is very simple, and takes 3 steps:

1. Scan in `t`, `s`, and `d`
2. Convert `s` to `si`, then get `si`'s `int` value, `i`
3. Compute `i % d`

We scan in `t` with a `Scanner` object: (I like to call it `timesRun`)
```java
Scanner scan = new Scanner(new File("espionage.dat"));
        int timesRun = scan.nextInt();
```

Then we scan in `s` and `d`:
```java
s = scan.next(); d = scan.nextInt();
```

In order to convert `s` to `si`, I converted `s` to a `char` array, then cast every character to its corresponding `ASCII` value using `(int)`:
```java
arr = s.toCharArray();

            for(char c : arr) {
                si += (int) c;
            }
```

Finally, I converted `si` to a `BigInteger` (because `si` could possibly be larger than an `int` or a `long`), then performed a modulo operation with `d` as a `BigInteger`:
```java
System.out.println(new BigInteger(si).mod(BigInteger.valueOf(d)).toString());
```
Since this was done within the `println` statement, we're done!

Here is the full solution:
```java
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
```
