package prototype;

public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Create sheep instances
        Animal sheep1 = registry.createSheep("Wool");
        Animal sheep2 = registry.createSheep("Fluffy");
        
        // Create cow instances
        Animal cow1 = registry.createCow("Bessie");
        Animal cow2 = registry.createCow("Daisy");
        
        // Create horse instance
        Animal horse = registry.createHorse("Spirit", "Black");

        System.out.println("=== Sheep Prototypes ===");
        System.out.println(sheep1);
        sheep1.makeSound();
        
        System.out.println(sheep2);
        sheep2.makeSound();

        System.out.println("\n=== Cow Prototypes ===");
        System.out.println(cow1);
        cow1.makeSound();
        
        System.out.println(cow2);
        cow2.makeSound();

        System.out.println("\n=== Horse Prototype ===");
        System.out.println(horse);
        horse.makeSound();
    }
}
