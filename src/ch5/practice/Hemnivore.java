package ch5.practice;

 public interface Hemnivore {

    final int x = 30;

    public default String aa(){
        return "Ali";
    }

    public static int bb(){
         return x * x;
    }



    void eatPlant();
}
