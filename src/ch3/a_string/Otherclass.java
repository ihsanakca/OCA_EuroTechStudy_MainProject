package ch3.a_string;

public class Otherclass {
    public static void main(String[] args) {


        System.out.println("Ahmet"+2+9);
        System.out.println("Ahmet"+(2-9));
        System.out.println("Ahmet"+(2+9));
        System.out.println("Ahmet"+2/9);
        System.out.println(2+9+"Ahmet"+2+9);
        System.out.println(2-9+"Ahmet"+2+9);

    //    String s = 'a'+'b';
        String s1 = "a"+"b"+5;
        String str = "Ahmet";
        String reverse = "";

        for (int i = str.length()-1; i <=0 ; i--) {
             reverse += str.charAt(i);
        }

        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str = " + str);

        Q041 q041 = new Q041();
        q041.equals(44);

        String [] names = new String[3];
        System.out.println("names[1] = " + names[1]);
       // System.out.println("names[1].concat(\"Ada\") = " + names[1].concat("Ada"));
        System.out.println("names[0].length() = " + names[0].length());

    }
}
