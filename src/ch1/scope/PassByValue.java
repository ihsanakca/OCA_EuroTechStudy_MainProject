package ch1.scope;

import java.util.Arrays;

public class PassByValue {

    public static void main(String[] args) {
        Integer x = 10;

        System.out.println(x);  //10
        System.out.println(doubleX(x)); //20
        System.out.println(x);  //10


        String str = "Selda";
        System.out.println(str.toUpperCase()); //SELDA
        System.out.println(str); //Selda

        int[] nums = {5,10,15};

        System.out.println(Arrays.toString(nums));
        System.out.println(nums);

        doubleX(nums);


        System.out.println(Arrays.toString(nums));
        System.out.println(nums);

    }

    private static int doubleX(int x){
        x = x * 2;
        return x;
    }

    private static int [] doubleX(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }
        return nums;
    }
}
