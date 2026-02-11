// read the Java API (constructors & method summary)

public class Person {
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    /**
     * Constructor
     * @ param age the age of the person
     * @ param name the name of the person 
     */

    /**
     * @param reurn, return the name of the person
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // javadoc -d api Person.Java
    

}