package ch1.packages.staticImport;

public class AAA {

    public static int x = 10;
    public  int n = 10;

    public static void printX(){
        System.out.println(x);
    }

    public static void printY(int number){
        System.out.println(number);
    }

    public void printZ(int number){
        System.out.println(number * number);
    }
}
