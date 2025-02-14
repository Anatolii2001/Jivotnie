abstract class Jivotnoe {
    private final String name;

    public Jivotnoe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Животное: " + name;
    }
}
