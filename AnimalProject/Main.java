public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Juan", true); 
        Dog dog1 = new Dog("Bruno", 75); 
        Dog dog2 = new Dog("Coly", 50); 

        System.out.println(cat.toString());
        cat.greets();

        System.out.println(dog1.toString());
        dog1.greets();

        dog1.greets(dog2);  
    }
}
