
package ch1.packages;

import java.util.Date;

public class Otherclass{
    static String str = "Ali";
    static final String str1 = "Ali";
    public Otherclass(){
        String str = "Ali";
    }
    public static void main(String[] args) {
        Date date;
        java.sql.Date date1;

        String str = "Ali";
        Otherclass otherclass = new Otherclass();
        Otherclass otherclass1 = new Otherclass();
        otherclass1.str = "Cemil";
        System.out.println("otherclass.str = " + otherclass.str);
        Otherclass.str = "Mehmet";
        System.out.println("otherclass.str = " + otherclass.str);
        otherclass.str = "Ayaz";
        System.out.println("otherclass.str = " + otherclass.str);
        System.out.println("otherclass.str = " + otherclass1.str);
    }
    static {
        String str = "Veli";
        System.out.println("str = " + str);

    }

    {
        String str = "Melih";
        System.out.println("str = " + str);
        System.out.println("this.str = " + this.str);
      //  System.out.println("super.str = " + super.str);
    }

    public void ss(){
        String str = "Ali";
      //  int i =5;
        if (str.equals("Ali")){
            int i =10;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
	
}
