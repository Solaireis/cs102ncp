// do not need import
// java.lang.Comparable

public class Person implements Comparable<Person> {
    private int age;
    private String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Person another) {
        System.out.println("compareTo" + age + " " + another.age);
        return age - another.age; 
    }


    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    
}