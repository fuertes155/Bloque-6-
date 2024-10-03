public class Animal {
    private final String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void increaseAge(int years) {
        age += years;
    }

    @Override
    public String toString() {
        return "Animal[species=" + species + ", age=" + age + "]";
    }

    public void sound() {
        System.out.println("The " + species + " makes a sound.");
    }
}
