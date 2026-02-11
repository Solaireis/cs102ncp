class MyComparator {
    public int compare(Person x, Person y) {
        return x.getAge() - y.getAge();
    }
}
public class Sorter {
    public static void bubbleSort(Person[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].getAge() > arr[j + 1].getAge()) {           
                    // Swap 
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // all are in order
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSort(Person[] arr, MyComparator cmp){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (cmp.compare(arr[j], arr[j + 1]) > 0) {         
                    Person temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(Person[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Person input[] = new Person[]{new Person(3, "cherry"),new Person(1, "apple"),new Person(2, "banana")};
        //bubbleSort(input);
        bubbleSort(input, new MyComparator());
        printArray(input);
    }
}