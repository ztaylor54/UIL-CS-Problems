#Problem 1 | Loopy Lambda
| **Program Name** | **Input File** |
|------------------|----------------|
| `A_One.java`     | `none`         |

[__LINK TO SOLUTION__](https://github.com/ztaylor54/UIL-CS-Problems/blob/master/2016-Invitational-A/java/A_One.java)

Java 8 has some really cool stuff! Below is a complete program that creates a list of integers and outputs the list in six different ways, two of which are new techniques from Java 8.
* The first three are the traditional **for, while,** and **do while loop** processes.
* Next is the **for each** loop.
* The fifth uses a lambda expression.
* The sixth uses the double colon output technique.

There is no input required for this program. Just use the List structure provided, and choose four different ways to accomplish the same output. The judge will look at your source code to make sure you used **four different ways**. ***You are welcome to copy the coded shown below for your solution.***  
  
You are encouraged to use the new Java 8 techniques shown, but only if you're running Java 8.  
***DO NOT simply create the output by hardcoding.***  
  
```java
import java.util.*;
import java.land.System.*;

public class One {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7);
    //traditional for loop
    int x = 0;
    for(x = 0; x < list.size(); x++)
      out.print(list.get(x));
    out.println();
    //while loop
    x = 0;
    while(x < list.size()) {
      out.print(list.get(x));
      x++;
    }
    out.println();
    //do while loop
    x = 0;
    do {
      out.print(list.get(x));
      x++;
    } while(x < list.size());
    out.println();
    //for each loop
    for(int n : list)
      out.print(n);
    out.println();
    //lambda version...new with Java 8
    list.forEach(n->out.print(n));
    out.println();
    //new Java 8 double colon print statement...very cool!
    list.forEach(out::print);
    out.println();
  }
}
```

##Input
None
##Output
Four lines of digits as shown below, each line produced by a ***different*** iterative process of your own choosing.  
***The output is NOT to be hardcoded by simply outputting the string, `"1234567"`.***
##Sample input
```
none
```
##Actual output
```
1234567
1234567
1234567
```
