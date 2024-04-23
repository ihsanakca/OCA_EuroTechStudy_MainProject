package ch2.while_loop;

public class Otherclass {
    public static void main(String[] args) {
        int x = -1;
        while (1>x){
            System.out.println("1");
            x++;
        }

        do {
            System.out.println("2");
        }while (1<0);
    }
}
