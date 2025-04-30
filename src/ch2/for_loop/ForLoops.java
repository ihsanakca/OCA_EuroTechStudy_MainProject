package ch2.for_loop;

public class ForLoops {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("Ali");
        }

        int counter = 0;


        for (; ; ) {
            System.out.println("Ali");
            counter++;
            if (counter == 8)
                break;
        }


        System.out.println("Veli");
        int i, k;

        for (i = 0, k = 10; i < 5 && k > 7; i++, k -= 2) {
            System.out.println("Mehmet");
        }
        System.out.println("sonuc =" + i + " " + k);

        int z = 10;

        z++;
        z = z + 1;


        k -= 2;

        k = k - 2;

        int[] numbers = {2, 3, 6, 61, 36};

        for (int number : numbers) {
            System.out.println("ihsan");
            if (number % 2 == 0){
                System.out.println(number);
            }

        }

        for (int j = numbers.length-1 ; j >=0 ; j -= 2) {
            System.out.println("hasan");
            System.out.println(numbers[j]);
        }


        int[] numaralar = {2, 3, 6, 61, 36};

        for (int numara : numaralar) {
            System.out.println("******");
            if (numara  == 6){
                System.out.println(numara);
                break;
            }

        }
    }
}
