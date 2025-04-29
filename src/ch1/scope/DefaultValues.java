package ch1.scope;

public class DefaultValues {
    float name;

    DefaultValues() {
        String s;
        System.out.println(name);
      //  System.out.println(s);
    }


    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();

        System.out.println(dv.name);


        String str;

      //  System.out.println(str);
    }

    public static void aa(){
        int i = 10;
    }
}
