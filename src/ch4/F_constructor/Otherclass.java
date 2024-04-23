package ch4.F_constructor;

public class Otherclass {

    public static int i = 10;
    public int j = 20;

    Otherclass(){
        System.out.println("constructor");
    }
    static {
        System.out.println("static method");
    }
    {
        System.out.println("non static method");
    }

    public void aa(){
        System.out.println(this.j);
    }
    public static void bb (){
        System.out.println(i);
    }


    public static void main(String[] args) {
        Otherclass otherclass = new Otherclass();
        Otherclass otherclass1 = new Otherclass();
        otherclass.aa();
        Otherclass.bb();
    }
}
