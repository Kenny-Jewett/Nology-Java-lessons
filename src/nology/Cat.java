package nology;

public class Cat extends Animal {

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name) {
        this(name, 8, "brown");
    }

    @Override
    public String toString() {
        return "nology.Animal [" + "name= " + this.name + ", age= " + this.age + ", color= " + this.color + "]";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void favoriteFood() {
        System.out.println("My favorite food is tuna.");
    }
}
