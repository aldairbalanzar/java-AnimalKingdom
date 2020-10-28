package animalKingdomPackage;

public class Fish extends AbstractAnimal{
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    @Override
    public String getMovementType(){
        return "swim";
    }
    @Override
    public String getBreathingType(){
        return "gills";
    }
    @Override
    public String getReproductionType(){
        return "eggs";
    }

    @Override
    public String toString() {
        return "\n id: " + id + "\n name: " + name + "\n year discovered: " + yearDiscovered + "\n type of movement: " + getMovementType() +
                "\n type of breathing: " + getBreathingType() + "\n type of reproduction: " + getReproductionType() + "\n";

    }
}