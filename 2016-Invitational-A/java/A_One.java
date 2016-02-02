/*SOLVED by Zachary Taylor (ztaylor54)*/

import java.util.*;

public class A_One {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int x = 0;
        for (x = 0; x < list.size(); x++)
            System.out.print(list.get(x));
        System.out.println();
        x = 0;
        while (x < list.size()) {
            System.out.print(list.get(x));
            x++;
        }
        System.out.println();
        x = 0;
        do {
            System.out.print(list.get(x));
            x++;
        } while (x < list.size());
        System.out.println();
        for (int n : list) {
            System.out.print(n);
        }
        System.out.println();
    }
}
