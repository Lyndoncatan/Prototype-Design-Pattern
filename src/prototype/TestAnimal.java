package prototype;

public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep = registry.createSheep("Molly");
        Animal cow = registry.createCow("Bessie");
        Animal horse = registry.createHorse("Spirit", "Black");

        System.out.println(sheep);
        sheep.makeSound();

        System.out.println(cow);
        cow.makeSound();

        System.out.println(horse);
        horse.makeSound();
    }
}
