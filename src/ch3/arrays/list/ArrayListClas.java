package ch3.arrays.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListClas {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(25);
        list.add(5);
        list.add(6);
        list.add(7);

        List<Integer> list2 = new ArrayList<>(list);

        List<Integer> list3 = list;

        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

        list.add(15);

        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

        list.add(25);

        System.out.println("list = " + list);

        list.add(1,250);

        System.out.println("list = " + list);
         list.set(1,77);
        System.out.println("list = " + list);

        list.add(6,25555);
       // list.add(16,25555);

      //  list.set(10,77);
    //    list.remove(25555);
      //  list.remove(list.indexOf(25555));

        list.remove(Integer.valueOf(25555));
        System.out.println("list = " + list);


        List<String> names = new ArrayList<>(Arrays.asList("Ali","Veli","Fatma"));

        System.out.println("names = " + names);

    //    names.remove(1);
        System.out.println("names.remove(\"Mehtap\") = " + names.remove("Mehtap"));
        System.out.println("names = " + names);


        System.out.println("names.indexOf(\"Veli\") = " + names.indexOf("Veli"));
        System.out.println("names.indexOf(\"Mehtap\") = " + names.indexOf("Mehtap"));

    }
}
