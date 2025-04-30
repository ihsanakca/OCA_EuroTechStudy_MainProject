package ch2.operators;

public class Operators {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(++i); //11
        System.out.println(i++); //11
        System.out.println(i);   //12

        int x = i++;

        System.out.println("x = " + x);
        System.out.println(i);
    }
}
