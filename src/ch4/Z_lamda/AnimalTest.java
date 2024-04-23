package ch4.Z_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnimalTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,55,36,21,201,3,8));
        System.out.println("list = " + list);

        list.forEach(nums -> System.out.println(nums));

        System.out.println("---------------------");

        list.forEach(i ->{
            if(i%2==0){
                System.out.println(i);
            }
             });

        System.out.println("list = " + list);
        System.out.println("---------------------");

        list.replaceAll(num -> num > 10 ? 10 : num);
        System.out.println("list = " + list);

        list.replaceAll(num ->{
            if (num%2==0){
                return num=0;
            }
            return num;
        });

        System.out.println("list = " + list);

        list.removeIf(element -> element==0);

        System.out.println("list = " + list);

        System.out.println("-------------------------------");
        Animal animal1 = new Animal("kangaroo",true,false);
        Animal animal2 = new Animal("fish",false,true);
        Animal animal3 = new Animal("bird",true,true);
        Animal animal4 = new Animal("snake",false,true);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        System.out.println("animals = " + animals);


        animals.forEach(animal -> {
           if (animal.canHop()){
               System.out.println(animal);
           }
       });

        System.out.println("animals = " + animals);
        animals.replaceAll(animal -> {
            if (animal.canHop()){
              //  animal.setSpecies("zıpzıp");
            }
            return animal;
        });

        System.out.println("animals = " + animals);

        //forEach , replaceAll, removeIf

        System.out.println("-------------------------------");

        Predicate<Animal> animalPredicate = (Animal a) -> a.canSwim();

        Animal.print(animals,animalPredicate);
    }
}
