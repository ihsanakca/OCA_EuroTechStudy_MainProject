package ch3.arrays.basic;

import java.util.Arrays;

public class Otherclass {
    public static void main(String[] args) {
        int array [] = new int[3];   // 0 ,0 , 0

        array[0] = 5;
        array[1] = 15;
        array[2] = 25;




        int [] array1;
        array1 = new int[3];
        System.out.println("array1 = " + array1);
        array1[1] = 10;
        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));

        int [] array2 = new int[] {5,6,8};
        int [] array3 =  {5,6,8};

        int [] arr, arr1;
        arr = new int[2];
        arr1 = new int[5];

        int nums [] , num ;
        nums = new int[5];
        num = 5;

        String [] bugs = { "cricket", "beetle", "ladybug" };

        for (int i = 0; i < bugs.length; i++) {
            System.out.print(bugs[i]+" ");
        }

        System.out.println();

        for(String bug : bugs){
            System.out.print(bug+" ");
        }

        System.out.println();



        String [] alias = bugs;
        String alias2 [] = alias;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs==alias); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        String[] clone = bugs.clone();

        System.out.println("Arrays.toString(alias) = " + Arrays.toString(alias));
        System.out.println("Arrays.toString(alias2) = " + Arrays.toString(alias2));
        System.out.println("Arrays.toString(clone) = " + Arrays.toString(clone));

        bugs [0] = "goldbug";

        System.out.println("Arrays.toString(alias) = " + Arrays.toString(alias));
        System.out.println("Arrays.toString(alias2) = " + Arrays.toString(alias2));
        System.out.println("Arrays.toString(clone) = " + Arrays.toString(clone));

        String [][] names = new String[2][];
        System.out.println("names.length = " + names.length);


        int [][] multi = {
                {1,8,39,36,69,33,33},
                {1,12,36,6,6,6,6,5,5,0},
                {1,2,3,10,25,25}
        };

//        System.out.println("multi[0][2] = " + multi[0][2]);
//        System.out.println("multi[2][4] = " + multi[2][4]);
//        System.out.println("multi[1][0] = " + multi[1][0]);

        System.out.println("multi.length = " + multi.length);
        System.out.println("multi[0].length = " + multi[0].length);
        System.out.println("multi[1].length = " + multi[1].length);
        System.out.println("multi[2].length = " + multi[2].length);

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j <  multi[i].length; j++) {
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        for (int [] row : multi){
            for (int i : row){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    void aa(int num, String address, String...names){

    }
}
