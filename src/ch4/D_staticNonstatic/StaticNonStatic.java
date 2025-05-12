package ch4.D_staticNonstatic;

public class StaticNonStatic {

    int x = 10;
    static int y = 20;

    public static void print(){
        System.out.println(StaticNonStatic.y);
   //     System.out.println(this.y);
    //    System.out.println(this.x);
    //    System.out.println(x);


    }

    public static void main(String[] args) {




        StaticNonStatic stn1 = new StaticNonStatic();
        StaticNonStatic stn2 = new StaticNonStatic();

        System.out.println(stn1.x);  //10
        System.out.println(stn1.y);  //20

        System.out.println(stn2.x);  //10
        System.out.println(stn2.y);  //20

        stn1.x = 100;

        System.out.println(stn1.x);  //100
        System.out.println(stn2.x);  //10

        System.out.println("-------------");

        stn1.y = 777;

        System.out.println(stn1.y);  // 777
        System.out.println(stn2.y);  // 777



    }
}
