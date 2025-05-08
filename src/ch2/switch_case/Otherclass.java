package ch2.switch_case;

import java.util.ArrayList;
import java.util.List;

public class Otherclass {
    public static void main(String[] args) {

        int i = 5;
        int y = 1;
        List<Integer> list = new ArrayList<>();

        switch (i){
            case 5 :
                System.out.println(5);
                break;
            case 2 :
                System.out.println(2);
                break;
            default:
                System.out.println(3);
        }
    }
}
