import java.util.*;

public class Test {
    public static void printAll(List<Person> pList) {
        for (Person p : pList) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        List<Person> all = new ArrayList<>();

        all.add(new Person(13, "Apple"));
        all.add(new Person(12, "Durian"));
        all.add(new Person(14, "Banana"));
        
        printAll(all);
        System.out.println("-----");
        
        // Comparable - compareTo (default sorting)
        // Comparator - compare   (other ways of sorting)
        // no need Comparator
        // Collections.sort(all, new AgeComparator());
        Collections.sort(all);
        printAll(all);
    }
}
