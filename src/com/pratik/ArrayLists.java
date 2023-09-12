package com.pratik;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(8);
        System.out.println(list);

        // remove elements
        list.remove(2);
        System.out.println(list);

        // get element
        int element = list.remove(2);
        System.out.println(element);

        // iterate list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // or
        for (Integer elements : list) {
            System.out.print(elements + " ");
        }
        System.out.println();

        // set element -> modify elements
        list.set(0, 99);
        System.out.println(list);

        // sort list
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // or
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
