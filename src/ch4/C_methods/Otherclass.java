package ch4.C_methods;

public class Otherclass {
    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1); // 0
        walk(1, 2); // 1

        walk(1, 2, 3); // 2
        walk(8 ,new int[] {4, 5});


    }
}