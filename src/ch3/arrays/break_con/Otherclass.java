package ch3.arrays.break_con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Otherclass {
    public static void main(String[] args) {

       List aa = new ArrayList();
        aa.add(25);

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(3,6,9,25,36,9));

        System.out.println("list.indexOf(9) = " + list.indexOf(9));  //2
        System.out.println("list.indexOf(99) = " + list.indexOf(99));  // -1


        ArrayList <Integer> list2 = new ArrayList<>(list);
        ArrayList <Integer> list3 = list;

        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        list3.add(8888);

        list.add(7777);

        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

        List<Integer> lst = new ArrayList<>();
        lst.add(null);


    }
}
