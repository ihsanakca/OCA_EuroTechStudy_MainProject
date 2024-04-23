package ch5.casting.AAAA;

public class Test {
    public static void main(String[] args) {
        A a = new C();


      //  D d = (D) a;  // Runtime'da hata verir çünkü D ile C alakasızdır..

     //   B b = new C();
      //  D d1 =(D) b;








     //
        B b = (B) a;  // Hata vermez çünkü sub-super class ilişkisi var..
        b.bb();
        b.aa();

        B b1 = new C();
        A a1 = b1;

        C c = (C) a1;

        A a2 = new B();
      //  C c2 = (C) a2;  // Runtime'da hata verir çünkü B C'nin subclassı değildir.
  //      D d1 = (D) a2;   // Runtime'da hata verir çünkü D ile B alakasızdır..

        C c4 = new C();
      //  D d4 = c4;  // cast yaptırmaz... direkt CTE verir.

        A aa = new A();
        C c11 = (C) aa;


    }
}
