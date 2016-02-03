#Problem 10 | Abundance
| **Program Name** | **Input File**                                                                                                  |
|------------------|-----------------------------------------------------------------------------------------------------------------|
|  `A_Ten.java`    |   [`a_ten.dat`](https://github.com/ztaylor54/UIL-CS-Problems/blob/master/2016-Invitational-A/input/a_ten.dat)   |

[__LINK TO SOLUTION__](https://github.com/ztaylor54/UIL-CS-Problems/blob/master/2016-Invitational-A/java/A_Ten.java)  
  
An abundant number is one whose sum of all proper divisors is greater than the number itself. By definition, a proper divisor is a positive divisor of a number, excluding itself.  
  
The first such number is 12, where `1 + 2 + 3 + 4 + 6` equals 16, which is greater than 12. Others include 18, 20, 24, 30, and so on.  
Given an input value `N` find and output the largest abundant number less than `N`.  
##Input
A data file with several values of `N`, each on its own line, where `13 <= N <= 100,000`.  
##Output
The largest abundant number less than `N`.  
##Sample input:
```
15
20
50
107
4050
```
##Sample output:
```
12
18
48
104
4048
```
