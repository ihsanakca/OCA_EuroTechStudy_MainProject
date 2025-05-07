package ch3.arrays.basic;

import java.util.Arrays;
import java.util.SimpleTimeZone;

public class ArrayClass {
    public static void main(String[] args) {

        int[] array = new int[3]; // 0, 0, 0
        System.out.println(Arrays.toString(array));
        array[0] = 10;
        array[1] = 20;
        array[2] = 50;

        System.out.println(Arrays.toString(array));

        int array1[];  //deklarasyon
        array1 = new int[2]; //ilk değer atama  // 0 , 0

        int array2[] = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array2));

        int[] array3 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(array3));

        int array4[];  //deklarasyon
        array4 = new int[]{1, 2, 3, 4, 5};


        String[] strArr = {"Ali", "Veli"};
        System.out.println(strArr.length);

        String[] strArray = {"Ali", "Veli", "Filiz", "Sema"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]+ " ");
        }

        System.out.println();

        for (String s : strArray){
            System.out.print(s + " ");
        }

        System.out.println();

        String name = "Ahmet";
        String ad = name;

        System.out.println("ad = " + ad);

        name = "Mehmet";

        System.out.println("ad = " + ad);

        String[] adlar = {"Ali", "Veli", "Filiz", "Sema"};
        String[] isimler = adlar;

        String [] names = adlar.clone();

        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        adlar[0] = "Hümeyra";

        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));


        int i = 5;
        int y = i;
         i= 8;
        System.out.println("y = " + y);


        int [][] multi = new int[3][4];


        // {2 , 3, 4, 0}  // 0-0 0-1 0-2 0-3
        // {2, 0 ,0 ,0}  //  1-0 1-1 1-2 1-3
        // {2, 2, 2, 2}  //  2-0 2-1 2-2 2-3

        int [][] multiInt = new int[3][4];
        multiInt[0][0] = 5;
        multiInt[0][1] = 5;
        multiInt[0][3] = 5;
        multiInt[1][0] = 5;
        multiInt[1][1] = 5;

        System.out.println("multiInt[2][1] * 9 = " + multiInt[2][1] * 9);

        System.out.println("Arrays.deepToString(multiInt) = " + Arrays.deepToString(multiInt));

        int [][] multiInt2 = {
                {1,2,5,6},    //0
                {2,3},        //1
                {1,3,2,2,5,8} //2
        };
        System.out.println("Arrays.deepToString(multiInt) = " + Arrays.deepToString(multiInt2));

      //  System.out.println("multiInt2[1][2] = " + multiInt2[1][2]);

        System.out.println("multiInt2.length = " + multiInt2.length); //3
        System.out.println("multiInt2[2].length = " + multiInt2[2].length);
        System.out.println("multiInt2[1].length = " + multiInt2[1].length);
        System.out.println("multiInt2[0].length = " + multiInt2[0].length);


        //fori
        for (int j = 0; j < multiInt2.length; j++) {  //satır
            for (int k = 0; k < multiInt2[j].length; k++) { //sütun
                System.out.print(multiInt2[j][k]+ " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        //forEach
        for (int [] arr : multiInt2){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
