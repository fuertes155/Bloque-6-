public class Mammal extends Animal {
    private final int numberOfLegs; 

    public Mammal(String species, int numberOfLegs, int age) {
        super(species, age); 
        this.numberOfLegs = numberOfLegs; 
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + ", numberOfLegs=" + numberOfLegs + "]";
    }

    public void walk() {
        System.out.println("The mammal is walking on its " + numberOfLegs + " legs.");
    }
}
