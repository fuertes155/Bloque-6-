public abstract class Person {
    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return String.format("Person[name=%s, address=%s, role=%s]", name, address, getRole());
    }
}
