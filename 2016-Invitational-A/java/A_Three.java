/*SOLVED by Zachary Taylor (ztaylor54)*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class A_Three {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> board = new ArrayList<>(); //the board
        ArrayList<Integer> indexes = new ArrayList<>(); //keep track of each penny's position

        Scanner scan1 = new Scanner(new File("a_three.dat")); //iterate the lines

        while (scan1.hasNextLine()) {
            String line = scan1.nextLine();
            Scanner scan = new Scanner(line);
            scan.useDelimiter(" ");
            int boardSize = scan.nextInt();
            for (int i = 0; i < boardSize; i++) {
                board.add(0);
            }

            int numPennies = scan.nextInt();

            int index;
            for (int pens = 0; pens < numPennies; pens++) { //populate the board
                index = scan.nextInt();
                board.set(index - 1, 1);
                indexes.add(index - 1); //keep track of the indexes here
            }

            //debugging the board:
            //System.out.println(board.toString());

            int one = 0, two = 0, three = 0, four = 0, five = 0;

            /*1, 2, 3, 4, 5*/

            /*  1   */
            for (int currIndex : indexes) {
                if (currIndex > 0 && board.get(currIndex - 1) == 0) {
                    one++;
                }
            }


            /*  2   */
            for (int currIndex : indexes) {
                if (currIndex > 1)
                    if (board.get(currIndex - 1) == 0)
                        if (board.get(currIndex - 2) == 0)
                            two++;
            }

            /*  3   */
            for (int currIndex : indexes) {
                if (currIndex > 2)
                    if (board.get(currIndex - 1) == 0)
                        if (board.get(currIndex - 2) == 0)
                            if (board.get(currIndex - 3) == 0)
                                three++;
            }

            /*  4   */
            for (int currIndex : indexes) {
                if (currIndex > 3)
                    if (board.get(currIndex - 1) == 0)
                        if (board.get(currIndex - 2) == 0)
                            if (board.get(currIndex - 3) == 0)
                                if (board.get(currIndex - 4) == 0)
                                    four++;
            }

            /*  5   */
            for (int currIndex : indexes) {
                if (currIndex > 4)
                    if (board.get(currIndex - 1) == 0)
                        if (board.get(currIndex - 2) == 0)
                            if (board.get(currIndex - 3) == 0)
                                if (board.get(currIndex - 4) == 0)
                                    if (board.get(currIndex - 5) == 0)
                                        five++;
            }

            System.out.println(one + " " + two + " " + three + " " + four + " " + five);
            board.clear();
            indexes.clear();
        }
    }
}
