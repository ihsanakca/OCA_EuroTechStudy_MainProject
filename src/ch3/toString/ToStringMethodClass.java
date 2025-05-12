package ch3.toString;

public class ToStringMethodClass {

    int age;
    String name;

    public ToStringMethodClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age  + " -> " + name;
    }

    public static void main(String[] args) {
        ToStringMethodClass obj1 = new ToStringMethodClass(23,"İhsan");
        System.out.println(obj1.toString());
        System.out.println(obj1);

        System.out.println(obj1.name.equals("İhsan"));
        System.out.println(obj1.age);
        StringBuilder sb = new StringBuilder("Gamze");
        System.out.println(sb);
    }
}
