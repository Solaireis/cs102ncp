public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void incrementAge() {
        age++;
    }
    
    public abstract void eat();
}
