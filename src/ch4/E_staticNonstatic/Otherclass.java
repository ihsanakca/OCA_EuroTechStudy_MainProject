package ch4.E_staticNonstatic;

public class Otherclass {
    int i =10;
    static int j = 20;

    public static void main(String[] args) {
        Otherclass o1 = new Otherclass();
        Otherclass o2 = new Otherclass();

        o1.i =20;
        o1.j = 100;

        System.out.println("o2.i = " + o2.i);
        System.out.println("o2.j = " + o2.j);
    }
}
