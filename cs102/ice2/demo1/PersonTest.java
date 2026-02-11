// Explain the difference between the two
// access modifier (public & private)
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(12, 'F');
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println(p.getAge());
        System.out.println(p.getGender());
        
    }
}