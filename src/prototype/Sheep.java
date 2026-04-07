package prototype;

public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(String name) {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = name;
    }

    private Sheep(Sheep sheep) {
        this.legs = sheep.legs;
        this.sound = sheep.sound;
        this.food = sheep.food;
        this.name = sheep.name;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the sheep says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Sheep{name='%s', legs=%d, sound='%s', food='%s'}", name, legs, sound, food);
    }
}
