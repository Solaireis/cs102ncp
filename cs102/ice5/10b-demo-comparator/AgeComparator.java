// package abc;
import java.util.*; // step 1

  // step 2: extends Comparator<T>
public class AgeComparator implements Comparator<Person> {

    // step 3: implements the compare method
    public int compare(Person p1, Person p2) {
        System.out.println("compare " + p1.getAge() + " " + p2.getAge());
        int cmp = p1.getAge() - p2.getAge(); // 10 - 8
        if (cmp != 0) {
            return cmp;
        }
        // public class String implements Comparable<String> {
        //  compareTo 
        //}
        return p1.getName().compareTo(p2.getName());
    }

}