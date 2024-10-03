public class Dog extends Mammal {
    private int energyLevel;

    public Dog(String name, int energyLevel) {
        super(name, 4, 0); 
        this.energyLevel = energyLevel;
    }

    public void increaseEnergyLevel(int amount) {
        energyLevel += amount;
    }

    public void decreaseEnergyLevel(int amount) {
        energyLevel -= amount;
    }

    public void greets() {
        if (energyLevel > 50) {
            System.out.println("WOOF WOOF!");
        } else {
            System.out.println("Woof");
        }
    }

    public void greets(Dog another) {
        if (energyLevel > 50 && another.energyLevel > 50) {
            System.out.println("WOOF WOOOOF!");
        } else {
            System.out.println("Woof woof");
        }
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", energyLevel=" + energyLevel + "]";
    }
}
