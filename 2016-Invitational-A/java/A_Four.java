/*SOLVED by Zachary Taylor (ztaylor54)*/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Four {
    public static int current_memory = 0;
    public static ArrayList<Integer> memory = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 200; i++)
            memory.add(0);
        Scanner scan = new Scanner(new File("a_four.dat"));
        String line;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            String[] arr = line.split(" ");
            switch (arr[0]) {
                case "DEF":
                    DEF(arr[1].charAt(0), arr[2].charAt(0));
                    break;
                case "STO":
                    STO(arr[1].charAt(0));
                    break;
                case "REC":
                    REC(arr[1].charAt(0));
                    break;
                case "ADD":
                    ADD(arr[1].charAt(0));
                    break;
                case "SUB":
                    SUB(arr[1].charAt(0));
                    break;
                case "MUL":
                    MUL(arr[1].charAt(0));
                    break;
                case "DIV":
                    DIV(arr[1].charAt(0));
                    break;
                case "PRN":
                    PRN(arr[1].charAt(0));
                    break;
            }
        }
    }

    public static void DEF(char X, char Y) {
        memory.set((int) X, Integer.parseInt(Y + ""));
        //System.out.println("set " + Y + " to memory[" + (int)X + "]");
    }

    public static void STO(char X) {
        memory.set((int) X, current_memory);
    }

    public static void REC(char X) {
        current_memory = memory.get((int) X);
    }

    public static void ADD(char X) {
        current_memory += memory.get((int) X);
    }

    public static void SUB(char X) {
        current_memory -= memory.get((int) X);
    }

    public static void MUL(char X) {
        current_memory *= memory.get((int) X);
    }

    public static void DIV(char X) {
        current_memory /= memory.get((int) X);
    }

    public static void PRN(char X) {
        System.out.println(memory.get((int) X));
    }

}
