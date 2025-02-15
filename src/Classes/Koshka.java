package Classes;

import Abstract.Mlekopitaushee;
import Interface.ImeetSherst;

public class Koshka extends Mlekopitaushee implements ImeetSherst {
    public Koshka(String name) {
        super(name);
    }

    @Override
    public void giveBirth() {
        System.out.println(getName() + " живородящая.");
    }

    @Override
    public void uhajivat() {
        System.out.println(getName() + " ухаживает за шерстью.");
    }

    @Override
    public String makeSound() {
        return getName() + " издает звук \"Мяу\"";
    }

    @Override
    public void move() {
        System.out.println(getName() + " двигается крадучись, бегает");
    }

    @Override
    public String toString() {
        return "Кошка: " + getName();
    }
}
