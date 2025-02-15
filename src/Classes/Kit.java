package Classes;

import Abstract.Mlekopitaushee;
import Interface.ObitatelVodi;

public class Kit extends Mlekopitaushee implements ObitatelVodi {
    public Kit(String name) {
        super(name);
    }

    @Override
    public void plavat() {
        System.out.println(getName() + " плавает в воде.");
    }

    @Override
    public void giveBirth() {
        System.out.println(getName() + " живородящий.");
    }

    @Override
    public String makeSound() {
        return getName() + " издает звуки";
    }

    @Override
    public void move() {
        System.out.println(getName() + " перемещается в воде.");
    }

    @Override
    public String toString() {
        return "Кит: " + getName();
    }
}
