public class Person {
    public int age; // bad practice to leave it as public
    private char gender;

    public Person(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}