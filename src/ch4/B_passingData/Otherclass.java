package ch4.B_passingData;

public class Otherclass {
    public static void main(String[] args) {
        Integer num = 25;
        doubleBy(num);
        System.out.println(num);



        String name = "Mehmet";
        System.out.println("name = " + name);
        add_1(name);
        System.out.println("name = " + name);


        StringBuilder sb = new StringBuilder("Ahmet");
        System.out.println("sb = " + sb);
        add(sb);
        System.out.println("sb = " + sb);
    }

    static int doubleBy(Integer num){
        return num*2;
    }

    static StringBuilder add(StringBuilder nm){
        return nm.append("technic");
    }

    static String add_1(String sb){
        return sb.concat("technic");
    }
}
