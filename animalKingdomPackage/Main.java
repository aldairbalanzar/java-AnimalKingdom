package animalKingdomPackage;

import java.util.List;
import java.util.ArrayList;

public class Main {
    private static void animalKingdom() {
        // Mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal armadillo = new Mammal("Armadillo", 1804);
        Mammal raccoon = new Mammal("Raccoon", 1754);
        Mammal sloth = new Mammal("Sloth", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // List containing animals for prints
        List<AbstractAnimal> animals = new ArrayList<>();
        List<AbstractAnimal> filteredList = new ArrayList<>();

        // Testing out eat method
//        panda.eat("apple");
//        panda.eat("banana");
//        panda.eat("grapes");

        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(sloth);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

//        System.out.println("alphabetical name sort: ");
//        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

//        System.out.println("year discovered descending: ");
//        animals.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());

//        System.out.println("movement sort: ");
//        animals.sort((a1, a2) -> a1.getMovementType().compareToIgnoreCase(a2.getMovementType()));

//        System.out.println("breathing sort: ");
//        animals.sort((a1, a2) -> a1.getBreathingType().compareToIgnoreCase(a2.getBreathingType()));

//        System.out.println("breathe w/ lungs & discovered in 1758: ");
//        animals.stream().filter(a -> a.getBreathingType() == "lungs").forEach((a) -> System.out.println(a.getName() + " - " + a.getBreathingType()));

//        System.out.println("lay eggs & breate w/ lungs: ");
//        animals.stream().filter(a -> a.getBreathingType() == "lungs" && a.getReproductionType() == "eggs").forEach((a) -> System.out.println(a.getName() + " - " + a.getReproductionType() + " - " + a.getBreathingType()));

        System.out.println("alphabetical sort & discovered in 1758: ");
        animals.stream().filter(a -> a.getYearDiscovered() == 1758).sorted((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()))
                .forEach((a) -> System.out.println(a.getName() + " - " + a.getYearDiscovered()));
    }

    public static void main(String[] args) {
        animalKingdom();
    }
}