// 2. instanceof and casting
// Covariance Return Type: https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#d5e15988
// 
public class Test {
    public static void main(String[] args) {
        // Person p1 = new Person(12, "apple");
        // Person p2 = new Person(12, "apple");
        // Person p3 = new Person(12, "apple");
        // System.out.printf("p1.equals(p2): %s%n", p1.equals(p2));
        // System.out.printf("p2.equals(p3): %s%n", p1.equals(p3));

        Person p1 = new Person(12, "apple");
        Person p2 = (Person) p1.clone(); // new Person(12, "apple");
    }    
}
