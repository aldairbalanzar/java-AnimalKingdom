package animalKingdomPackage;

import java.util.List;
import java.util.ArrayList;

abstract class AbstractAnimal {
    private static int maxId = 0;

    // protected, only parent & child know of field
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected List<String> stomach;

    public AbstractAnimal(String name, int yearDiscovered) {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.stomach = new ArrayList<String>();
    }

    public void eat(String food) {
        stomach.add(food);
    }

    public List<String> getStomach() {
        return this.stomach;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getYearDiscovered() {
        return this.yearDiscovered;
    }

    abstract String getMovementType();
    abstract String getBreathingType();
    abstract String getReproductionType();
}