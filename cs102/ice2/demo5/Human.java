public class Human {
    // the difference between static and instance
    private int age;
    private char gender;

    public Human(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        // any other ways??
        return "age=" + age + ", gender=" + gender;
    }

}