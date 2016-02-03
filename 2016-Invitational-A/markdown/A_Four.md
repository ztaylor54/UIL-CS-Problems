#Problem 4 | SimpleCalc
| **Program Name** | **Input File**                                                                                                  |
|------------------|-----------------------------------------------------------------------------------------------------------------|
|  `A_Four.java`   |  [`a_four.dat`](https://github.com/ztaylor54/UIL-CS-Problems/blob/master/2016-Invitational-A/input/a_four.dat)  |

[__LINK TO SOLUTION__](https://github.com/ztaylor54/UIL-CS-Problems/blob/master/2016-Invitational-A/java/A_Four.java)  
  
This problem demonstrates a very simple command line calculator using the codes listed below. Your job is to write a program to evaluate the results of the commands listed.  
  
The codes used are listed below, where `X` indicated a single capital letter that indicates a storage location, and `Y` is an integer value within the standard range of a byte value:  

| Command     | Operation                                                                    |
|-------------|------------------------------------------------------------------------------|
| **DEF X Y** | Assign the `Y` value into the `X` variable indicated                         |
| **STO X**   | Store the current memory value into the `X` variable indicated               |
| **REC X**   | Place the value of `X` into current memory                                   |
| **ADD X**   | Add the `X` value into current memory                                        |
| **SUB X**   | Subtract `X` from current memory                                             |
| **MUL X**   | Multiply current memory by `X`                                               |
| **DIV X**   | Integer divide current memory by `X`                                         |
| **PRN X**   | Output value contained in the variable `X` indicated, followed by a linefeed |  
  
##Input
A series of commands, each on one line, each command representing one of the calculation codes listed above.
##Output
Show the results of each `PRN` command during the series of commands.
##Sample input:
```
DEF A 1
DEF B 2
DEF C 3
PRN C
REC A
MUL C
STO A
PRN A
DIV B
STO C
PRN C
SUB A
STO B
PRN B
ADD A
PRN A
```
##Sample output:
```
3
3
1
-2
3
```
