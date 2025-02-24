package Abstract;

import java.util.Objects;

public abstract class Jivotnoe {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jivotnoe jivotnoe = (Jivotnoe) obj;
        return Objects.equals(name, jivotnoe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
