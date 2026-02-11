import java.util.*;

public class Test {
    public static void printAll(List<Person> pList) {
        for (Person p : pList) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        List<Person> all = new ArrayList<>();

        all.add(new Person(12, "Apple"));
        all.add(new Person(13, "Charlie"));
        all.add(new Person(11, "Banana"));

        // sort
        printAll(all);
        System.out.println("-----");

        /*
        Person p1 = all.get(0);
        Person p2 = all.get(1);
        Comparator<Person> p = new AgeComparator();
        // positive - first value > second value
        if (p.compare(p1, p2) > 0) {
            // ..
        }
        */
       // all - List<Person>
        Collections.sort(all, new AgeComparator());
        // sort
        printAll(all);
        
    }
}
