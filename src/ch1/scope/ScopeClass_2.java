package ch1.scope;

public class ScopeClass_2 {

    String str = "Ali";

    public ScopeClass_2() {
        String str = "Ali";
        System.out.println("const.");
    }

    static {
        String str = "Ali";
        System.out.println("statik blok");
    }


    {
        String str = "Ali";
        System.out.println("instance blok");
    }


    public void print(){
        String str = "Ali";
        int z = 10;

        if (str.length()==3){
            int i = 10;
            System.out.println(z);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(z);
        }

       try {
           int i = 10;
           System.out.println(z);
       }catch (Exception e){
           e.printStackTrace();
           int i = 10;
           System.out.println(z);
       }

       String name , surname = "Tok" ; name = "Aylin";
    }

    public static void print2(){
        String str = "Ali";
    }

    public  void print3(){
        String str = "Ali";
        System.out.println("normal metod");
    }

    public static void main(String[] args) {
        ScopeClass_2 obj1 = new ScopeClass_2();
        ScopeClass_2 obj2 = new ScopeClass_2();
        ScopeClass_2 obj3 = new ScopeClass_2();
        ScopeClass_2 obj4 = new ScopeClass_2();

        obj1.print3();
    }


}
