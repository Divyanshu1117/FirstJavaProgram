import java.util.*;

import java.util.ArrayList;

public class CWH_91_collections_arraylist {
    public static void main(String[] args) {
//        ArrayList:-
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);

        l1.set(1, 566);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.indexOf(159));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.remove(1));
        System.out.println("Is List Empty? " + l1.isEmpty());
        System.out.println("Sub List: " + l1.subList(1, 4));
        l1.sort(null);
        System.out.println("Sorted List: " + l1);

//        l1.clear();

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
//        System.out.println(l1);
    }
}