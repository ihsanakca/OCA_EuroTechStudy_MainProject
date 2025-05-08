package ch3.arrays.break_con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,6));

        System.out.println("list = " + list);

        Iterator<Integer> iter = list.iterator();

//        System.out.println("iter.hasNext() = " + iter.hasNext());
//        System.out.println("iter.next() = " + iter.next());
//        System.out.println("iter.hasNext() = " + iter.hasNext());
//        System.out.println("iter.next() = " + iter.next());
//        System.out.println("iter.hasNext() = " + iter.hasNext());
//        System.out.println("iter.next() = " + iter.next());
//        System.out.println("iter.hasNext() = " + iter.hasNext());
//        System.out.println("iter.next() = " + iter.next());
//        System.out.println("iter.hasNext() = " + iter.hasNext());

        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
