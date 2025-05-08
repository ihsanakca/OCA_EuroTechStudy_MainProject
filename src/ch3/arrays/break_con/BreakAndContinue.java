package ch3.arrays.break_con;

public class BreakAndContinue {
    public static void main(String[] args) {
        int x = 5;



     OUTER:   for (int i = 0; i < 3; i++) {
        INNER:    for (int j = 0; j < 5; j++) {

                if (j == 2){
                    break ;
                }
            System.out.println(i +" : "+j);
            }
        }
    }
}
