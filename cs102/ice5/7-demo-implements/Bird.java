public class Bird extends Animal 
        implements Flyable, Speedable, Swimmable {

    public void fly() { // Flyable
        System.out.println("fly");
    }

    public void speed() { // Speedable
        System.out.println("speed");
    }

    public void swim() { // Swimmable
        System.out.println("swim");
    }

    public void eat() { // Animal
        System.out.println("eat");
    }
}