
public class Main {
    public static void main(String[] args) {
        Kit kit = new Kit("Синий кит");
        Koshka koshka = new Koshka("Мурка");
        Medved medved = new Medved("Гризли");
        Riba riba = new Riba("Тунец");

        System.out.println(kit);
        kit.plavat();
        kit.giveBirth();
        System.out.println(kit.makeSound());
        kit.move();
        System.out.println();

        System.out.println(koshka);
        koshka.uhajivat();
        koshka.giveBirth();
        System.out.println(koshka.makeSound());
        koshka.move();
        System.out.println();

        System.out.println(medved);
        medved.uhajivat();
        medved.giveBirth();
        System.out.println(medved.makeSound());
        medved.move();
        System.out.println();

        System.out.println(riba);
        riba.plavat();
        System.out.println(riba.makeSound());
        System.out.println();
    }
}
