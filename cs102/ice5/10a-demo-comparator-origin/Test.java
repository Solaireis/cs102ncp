import java.util.*;

public class Test {
    public static void main(String[] args) {
        Person[] arr = new Person[] {
            new Person(12, "beng"),
            new Person(11, "seng"),
            new Person(13, "lian"),
        };

        //Sorter.bubbleSort(arr);
        // MyComparator - contains the logic of comparing 
        //                2 objects (who is considered "larger")
        Sorter.bubbleSort(arr, new MyComparator());
        System.out.println(Arrays.toString(arr));


    }
}