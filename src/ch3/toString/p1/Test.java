package ch3.toString.p1;



public class Test {
    public static void main(String[] args) {

        System.out.println("Hello "+ new StringBuilder("Java SE 8"));
        System.out.println("Hello "+ new MyString("Java SE 8"));
    }
}
