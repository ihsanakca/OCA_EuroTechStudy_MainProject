package ch6.exceprionPackage;

public class Test {
    public static void main(String[] args)  {
        int age = 15;

        if (age < 18){


               throw new MyException("Cızzz yaş uygun değil");


        }else{
            System.out.println("uygundur");
        }

        System.out.println("Tebrikler");


        if (age == 15){

                int c = 10;

              //  throw new YourException("Hey onbeşli");


        }else {
            System.out.println("Tokat yolları taşlı");
        }



        System.out.println("Harikasın " + age);
    }
}
