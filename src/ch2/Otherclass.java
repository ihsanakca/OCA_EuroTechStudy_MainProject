package ch2;

public class Otherclass {
    public static void main(String[] args) {


        int i = 0;
        for( i =0 ;i<5;) {
            System.out.println("AA");
            System.out.println("BB");
            System.out.println(i);
            i++;
        }

        System.out.println("i = " + i);

        int [] numbers = {3,5,6,9,4};

        for(int num : numbers) {
            if (num % 2 ==0) {
                System.out.println(num);
            }
        }
        String str = "dfdfdf";
        if (!str.isEmpty()){
            System.out.println("VV");
        }

    }
}
