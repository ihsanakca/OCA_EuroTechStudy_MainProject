package ch2.if_else;

public class IfElse {

    public static void main(String[] args) {

        long x = 8;
        if (x < 10)
            System.out.println("Ali");
        else if (x < 5)
            System.out.println("Selime");
        else if (x < 25)
            System.out.println("melahat");
        else if (x < 35)
            System.out.println("Evrim");
        else
            System.out.println("Veli");


        System.out.println(2 * 5);

         int c = 2 * 5;

     //   System.out.println(true ? "doğru"  : "yanlış");

        int sonuc =  (c < 10) ?  5 * 25  : 10 - 3 ;

        System.out.println("** "+sonuc);


        System.out.println((c < 10) ? "5 * 25"  : 10 - 3);

    }
}
