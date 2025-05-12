package ch4.C_methods;

public class MethodClass {
    public static void main(String[] args) {

        MethodClass methodClass = new MethodClass();
        methodClass.walk6("aa");
        aa(2);
    }

    static String aa(int x) {
        System.out.println(x);
        return "";
    }

    String walk6(String a) {
        if (a == "mehmet")
            return "";
        return "aaaaa";

    }

}
