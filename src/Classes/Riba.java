package Classes;

import Abstract.Jivotnoe;
import Interface.ObitatelVodi;

public class Riba extends Jivotnoe implements ObitatelVodi {
    public Riba(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return getName() + " молчит, не издает звуки";
    }

    @Override
    public void plavat() {
        System.out.println(getName() + " плавает в воде.");
    }

    @Override
    public String toString() {
        return "Рыба: " + getName();
    }
}
