package Lesson4.hw.Human;

import java.util.Arrays;

public class HumanTest {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7), new Human(25), new Human(59), new Human(12)
        };
        // array sort ascending:
        Arrays.sort(list, new HumanComparator());
        System.out.println("Human list sorted (asc): ");
        for (Human h : list)
            System.out.println(h.getAge());

        System.out.println("*********");

        // array sort descending:
        Arrays.sort(list, new HumanComparatorDesc());
        System.out.println("Human list sorted (desc): ");;
        for (Human h : list)
            System.out.println(h.getAge());
    }

}
