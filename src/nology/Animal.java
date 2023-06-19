package nology;

import java.util.Scanner;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;
    private static int num1 = 55;
    private static int num2 = 30;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Sound");
    }

    public static void print() {
        System.out.println("This is a static method!");
    }

    public static int addTwoNums() {
        return Animal.num1 + Animal.num2;
    }

    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println("Hello, " + name);

    }

    public static void userCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your city:");
        String city = scanner.next();
        if(city.toLowerCase().startsWith("a")) {
            System.out.println("You are a loser!");
        } else {
            System.out.println("Not sure what to put here.");
        }
    }

    public abstract void favoriteFood();


}
