package ch5.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Bear implements Hemnivore, Omnivore{


    @Override
    public void eatPlant() {
        aa();
        System.out.println("x = " + x);
        int time = Hemnivore.bb();

    }

    public static void main(String[] args) {
        pr("Ali");
        pr(5);
        pr(new String []{"Ahmet","Mehmet"});
        pr(new Scanner(System.in));
        pr(new ArrayList(Arrays.asList(2,3)));
    }


    private static void pr (Object o){
      //  System.out.println("o.hashCode() = " + o.hashCode());

        System.out.println("o.toString() = " + o.toString());
    }



}
