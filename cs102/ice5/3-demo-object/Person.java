public class Person /* extends java.lang.Object */ {
    private int age;
    public String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // equals
    // toString
    @Override
    // public boolean equals(Object obj) {
    //     if (!(obj instanceof Person)) {
    //         return false;
    //     }
    //     return p.age == age && p.name.equals(name);
    // }
    // public boolean equals(Object obj) {
    //     if (obj instanceof Person p) {
    //         return p.age == age && p.name.equals(name);
    //     } 
    //     return false;
    // }
    public boolean equals(Object obj) {
        if (!(obj instanceof Person p)) {
            return false;
        } 
        // Objects of the same class can access
        // each other attributes directly
        String myname = name;
        return p.age == age && myname.equals(p.name);
    }

    // covariance data type
    // for a overridden method, the return data type
    // is a sub-class of the superclass return data type
    public Person clone() {
        return new Person(age, name);
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

}
