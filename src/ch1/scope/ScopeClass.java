package ch1.scope;

public class ScopeClass {

    static String hastaneAdi;  //static variable  - global
    String doktorAdi; //instance variable  - global

    String name = "Ali";

    static String nameStatic = "Static Ali";

    public ScopeClass(){
        String name = "Ali Const.";
        System.out.println(name);
        System.out.println(this.name);
      //  System.out.println(ScopeClass.name);
    }

    static {
        String name = "Ali static blok.";
        System.out.println(name+ "static");
     //   System.out.println(this.name); hata verir
      //  System.out.println(ScopeClass.name);
        ScopeClass sc = new ScopeClass();
        System.out.println(sc.name);
    }

    {
        String name = "Ali instance blok.";
        System.out.println(name +" instance");
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        ScopeClass sc = new ScopeClass();
        sc.doktorAdi = "Ali";
        sc.hastaneAdi = "Acıbadem";
        System.out.println(sc.doktorAdi);
        System.out.println(sc.hastaneAdi);

        System.out.println("---------------");
        ScopeClass sc1 = new ScopeClass();
        sc1.doktorAdi = "Esra";
        System.out.println(sc1.doktorAdi);
        System.out.println(sc1.hastaneAdi);

        sc1.hastaneAdi = "Poyraz Hastanesi";

        ScopeClass.hastaneAdi = "Merve Hast.";

        System.out.println(sc.hastaneAdi);
        System.out.println(sc1.hastaneAdi);



    }
}
