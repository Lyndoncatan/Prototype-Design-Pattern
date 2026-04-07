package prototype;

public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;
    private String name;

    public Horse(String name, String color) {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Oats";
        this.color = color;
        this.name = name;
    }

    private Horse(Horse horse) {
        this.legs = horse.legs;
        this.sound = horse.sound;
        this.food = horse.food;
        this.color = horse.color;
        this.name = horse.name;
    }

    @Override
    public Horse clone() {
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Horse{name='%s', color='%s', legs=%d, sound='%s', food='%s'}", name, color, legs, sound, food);
    }
}
