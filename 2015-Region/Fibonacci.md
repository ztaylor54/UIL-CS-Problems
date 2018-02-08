# Problem 4: Fibonacci

| Program Name     | Input File      |
|------------------|-----------------|
| `Fibonacci.java` | `fibonacci.dat` |

The standard textbook example for recursion is the code that computes the terms in the Fibonacci sequence. This is possibly one of the worst examples for recursion. In fact, it should be given as an example of when not to use recursion.

Here is the code as given in most textbooks:
```java
public static int fibonacci(int n) {
  if(n == 0 || n == 1)
    return n;
  else
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```
The n<sup>th</sup> fibonacci number is defined as the sum of the (n - 1)<sup>th</sup> fibonacci number and the (n - 2)<sup>th</sup> fibonacci number.
For the base case the 0<sup>th</sup> fibonacci number is 0 and the 1<sup>st</sup> fibonacci number is 1.

If we were to expand all of the calls made to the method `fibonacci()`, you would see that there are a lot of duplicate function calls that end up wasting time and space on the function call stack. For small values of `n` this is not a problem. For example, for `n = 4` there are only 5 duplicate calls. However for bigger values of `n` the number of duplicate calls escalates.

Given some integer `N`, determine for many duplicate calls will be made to the `fibonacci()` method.

## Input
The first line of input will contain a single integer `T`, the number of test cases.
The only line of each test case contains a single integer `N`.

## Output
For each test case, print out the number of duplicated function calls.

## Example Input File
```shell
3
4
9
1
```

## Example Output to Screen
```shell
4
99
0
```

# Solution
This problem is rather straightforward: all we need to do is keep track of which `n` values have been computed.

I decided to keep an `ArrayList` of all computed `n` values, so I could check it at the beginning of every function call:
```java
private static ArrayList<Integer> computed = new ArrayList<>();
```
This was defined outside the `main()` method, so its scope would include the `fibonacci()` method.

I also created `numDuplicates` in the same scope, to keep track of the extraneous function calls:
```java
private static int numDuplicates;
```

Here's the `fibonacci()` method, which contains the "business end" of things:
```java
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
```
The most important section to note is the `if(computed.contains(n))` statement. It checks to see if we've already calculated the value for the current `n`, and does one of the following:
* If we've already computed this `n`, it's a duplicate! In turn, we increment `numDuplicates`
* If we haven't yet computed this `n`, we add it to the list because it's the first time we've calculated it, so it'll turn up as a duplicate if we encounter it again

This plus the `main()` method to handle `I/O` and iteration, yields the final solution:

```java
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
```

