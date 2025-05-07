package ch3.a_stringBuilder;

public class StringBuilderClass {
    public static void main(String[] args) {

        String s = "Ali";

        System.out.println(s.concat("Hasan"));

        System.out.println("s = " + s);

        StringBuilder sb = new StringBuilder("Mehtap");
        //   sb = "Ali";

        sb.append("Hasan");

        System.out.println("sb = " + sb);

        //    sb = s;

        StringBuilder sb1 = new StringBuilder(); //""

        sb1.append("Yasemin");
        System.out.println("sb1 = " + sb1);

        StringBuilder upper =new StringBuilder(sb1.toString().toUpperCase());
        System.out.println("upper = " + upper);

        StringBuilder stringBuilder = new StringBuilder(11);

        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("reverseNew(\"mehmet\") = " + reverseNew("mehmet"));

        stringBuilder.append("Ahmet eve geldi");
        System.out.println("stringBuilder.indexOf(\"e\") = " + stringBuilder.indexOf("el"));

        System.out.println("stringBuilder.substring(4) = " + stringBuilder.substring(4));

        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.reverse();

        System.out.println("stringBuilder = " + stringBuilder);

        StringBuilder one = new StringBuilder();   //""  //appendden sonra "a"
        StringBuilder two = new StringBuilder();  //""
        StringBuilder three = one.append("a");  //"a"

        System.out.println(one == two);
        System.out.println(one == three);


        StringBuilder sb5 = new StringBuilder("Yeşim");

        //son index + 1 = length

        sb5.delete(0,5);

        System.out.println("sb5 = " + sb5);


    }

    static String reverseNew (String str){
      return new StringBuilder(str).reverse().toString();
    }
}
