package animalKingdomPackage;

import java.util.List;
import java.util.ArrayList;

public class Main {

    // Function that takes an AbstractAnimal list and criteria to be added to returned list
    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> list, CheckAnimal func) {
        // temporary list that will hold objects that meet criteria. Will be returned.
        List<AbstractAnimal> tempList = new ArrayList<>();
        // iterate through list passed through function
        for(AbstractAnimal a : list) {
            // run each object through our criteria, if criteria returns true, add it to our tempList
            if(func.check(a)) {
                tempList.add(a);
            }
        }
        // return our list with objects that met criteria
        return tempList;
    }

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

        System.out.println("\nnew list method: ");
        // create new list that will hold filtered objects:
            // 1. filteredList will equal func that will take in list to filter and criteria of filter (function is declared at top of file)
        List<AbstractAnimal> filteredList = filterAnimal(animals, a -> a.getYearDiscovered() == 1758);
        // filteredList can now be treated like any other list, here we sort it
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        // print every single object in filteredList with .forEach()
        filteredList.forEach((a) -> System.out.println(a.getName() + " - " + a.getYearDiscovered()));
    }

    public static void main(String[] args) {
        animalKingdom();
    }
}