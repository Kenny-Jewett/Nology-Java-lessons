package nology;


public class Bat extends Animal implements CanFly, CanMakeSound {


    @Override
    public void favoriteFood() {
        System.out.println("My favorite food is bugs.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public String thisReturnsAString() {
        return "I return a string.";
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }
}
