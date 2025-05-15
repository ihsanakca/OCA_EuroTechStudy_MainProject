package ch4.Z_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 215, 20, 12, 23, 36, 398, 401, 4, 45));

        //forEach();   -- uygulandığı listte kalıcı değişiklik yapmaz. void
        //replaceAll();  -- uygulandığı listte kalıcı değişiklik yapar. void
        //removeIf();  -- uygulandığı listte kalıcı değişiklik yapar. boolean

        list.forEach(number -> System.out.println(number));
        System.out.println("------------------------");
        list.forEach(i -> {
            if (i % 2 == 0){
                System.out.println(i);
            }
        });

        System.out.println("------------------------");
        System.out.println("list = " + list);


        list.replaceAll(e -> e > 30 ? 30 : e);

        System.out.println("list = " + list);

        list.replaceAll(num -> {
            if (num % 3 == 0){
                return num = 0;
            }
            return num;
        });

        System.out.println("list = " + list);

        System.out.println("list.removeIf(element -> element == 0) = " + list.removeIf(element -> element == 0));
        System.out.println("list = " + list);

        Predicate<String> p = (String s) -> s.startsWith("S") ;

        String str = "Ayhan";
        if (p.test(str)){
            System.out.println(str);
        }else System.out.println("Bayhan");


        Predicate<Integer> pre = integer -> {return integer % 7 == 0;};

        System.out.println("pre.test(49) = " + pre.test(49));
        System.out.println("pre.test(28) = " + pre.test(28));
        System.out.println("pre.test(20) = " + pre.test(20));
    }
}
