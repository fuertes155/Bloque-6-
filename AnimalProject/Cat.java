public class Cat extends Mammal {
    private boolean isDomesticated;

    public Cat(String name, boolean isDomesticated) {
        super(name, 4, 0); 
        this.isDomesticated = isDomesticated;
    }

    public void domesticate() {
        isDomesticated = true;
    }

    public void wild() {
        isDomesticated = false;
    }

    public void greets() {
        if (isDomesticated) {
            System.out.println("Meow, human!");
        } else {
            System.out.println("Hiss!");
        }
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + ", domesticated=" + isDomesticated + "]";
    }
}
