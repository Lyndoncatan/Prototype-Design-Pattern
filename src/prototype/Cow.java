package prototype;

public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Cow(String name) {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Hay";
        this.name = name;
    }

    private Cow(Cow cow) {
        this.legs = cow.legs;
        this.sound = cow.sound;
        this.food = cow.food;
        this.name = cow.name;
    }

    @Override
    public Cow clone() {
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Cow{name='%s', legs=%d, sound='%s', food='%s'}", name, legs, sound, food);
    }
}
