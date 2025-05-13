package ch4.F_constructor;

public class Student {
    int age;
    String name;

    static String schoolName = "Namık Kemal OO";

    Student(int age, String name){
        this("Veli");
        this.age = age;

    }

    Student(String name){
        this();
        this.name = name;

    }

    Student(){

        System.out.println("Kayıt yapıldı.");
    }

    public static void main(String[] args) {
        new Student(25,"Aytaç");
        new Student("Arife");
        new Student();
    }
}
