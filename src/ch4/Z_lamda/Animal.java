package ch4.Z_lamda;

import java.util.List;
import java.util.function.Predicate;

public class Animal {
        private String species;
        private boolean canHop;
        private boolean canSwim;
        public Animal(String speciesName, boolean hopper, boolean swimmer) {
            species = speciesName;
            canHop = hopper;
            canSwim = swimmer;
        }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean canHop() { return canHop; }
        public boolean canSwim() { return canSwim; }
        public String toString() { return species; }

        public static void print(List<Animal> animals, Predicate<Animal> checker) {
           for (Animal animal : animals) {
                if (checker.test(animal))
                   System.out.print(animal + " ");
                 }
            System.out.println();
            }
 }


