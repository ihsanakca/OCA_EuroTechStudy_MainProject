package ch3.a_stringBuilder;

public class Otherclass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);
        sb.append("Ali");
        sb.reverse();

        System.out.println("sb = " + sb);

        String str = sb.toString();

        System.out.println("str = " + str);

        String name = "Ahmet";

        StringBuilder sb1 = new StringBuilder(name);
        sb1.reverse();
        System.out.println("sb1 = " + sb1);
    }
}
