package Classes;

import Abstract.Mlekopitaushee;
import Interface.ImeetSherst;

public class Medved extends Mlekopitaushee implements ImeetSherst {
    public Medved(String name) {
        super(name);
    }

    @Override
    public void giveBirth() {
        System.out.println(getName() + " живородящий.");
    }

    @Override
    public void uhajivat() {
        System.out.println(getName() + " ухаживает за шерстью.");
    }

    @Override
    public String makeSound() {
        return getName() + " рычит";
    }

    @Override
    public void move() {
        System.out.println(getName() + " двигается неуклюже, косолапит");
    }

    @Override
    public String toString() {
        return "Медведь: " + getName();
    }
}
