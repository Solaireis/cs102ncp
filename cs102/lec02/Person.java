package cs102.lec02;

public class Person {


    private double weight;
    private double height;
    private int age;

    public Person(){
        // the constructor must be the same as the parent name
        //similar to python oop
        // can contain 0 or more statement
        weight = 78;
        height = 1.7;
        age = 10;
    }
    public Person(double w, double h, int a){
        weight = w;
        height = h;
        age = a;
    }

    // if you did not define any constructor then java would give you one for free
    // Person jason = new Person();
    // if a constructor that has no default constructor given, 
    // then java would not automatically create a constructor for you
    // u can do 
    //public Person(double weight, double height, int age){
    //     this.weight = weight;
    //     this.height = height;
    //     this.age = age;
    // }
    // public static double calculateBMI(){

    // }Not recommended to put static as 
    public double calculateBMI(){
        return weight / (height * height);
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
