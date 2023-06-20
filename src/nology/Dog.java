package nology;

public class Dog extends Animal implements CanMakeSound{

    private String sound = "bark";

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog(String name) {
        this(name, 3, "brown");
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public void favoriteFood() {
        System.out.println("My favorite food is meat.");
    }


}
