package prototype;

public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep("Prototype Sheep");
        this.cowPrototype = new Cow("Prototype Cow");
        this.horsePrototype = new Horse("Prototype Horse", "Brown");
    }

    public Animal createSheep(String name) {
        Sheep sheep = sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    public Animal createCow(String name) {
        Cow cow = cowPrototype.clone();
        cow.setName(name);
        return cow;
    }

    public Animal createHorse(String name, String color) {
        Horse horse = horsePrototype.clone();
        horse.setName(name);
        horse.setColor(color);
        return horse;
    }
}
