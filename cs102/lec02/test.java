package cs102.lec02;


public class Test {
    public static void main(String[] args){
            //byte short int long 
            //float double
            //char boolean
            //store information about the person weight and height
            double johnWeight = 60;
            double johnHeight = 1.8;

            //how do we store the variable of two person
            //the primitive way is 
            double maryWeight = 60;
            double maryHeight = 60;
            // so whats the most optimal way to do this
            // lets create a class and how to create 
            // usually a class is stored on a seperate java file
            Person john = new Person();
            Person mary = new Person();

            //John height
            john.height = 1.8;
            john.weight = 60;

            //mary height
            mary.height = 1.7;
            mary.weight = 50;
            // use the new keyword when creating a new class
            // surppose you need 3 compartment then u need initialise
            // another new variable class
            
            //part 2 
            //constructors
            // class is just a new data type
            // class creates objects or instantiate
            // its a container that allows you 
            // to store values in the many compartment

            System.out.println(john.weight);
            System.out.println(john.age);
            System.out.println(john.height);
            // any double value is 0.0
            // int value is 0
            // char value should be '\u0000'
            // string is null
            // if running package in multiple directories expect the error to happen
            // javac cs102/lec02/*.java
            // java cs102.lec02.Test 
            System.out.println(" "); 

            // now the person would be printed with the default value;
            Person jane = new Person(); 
            System.out.println(jane.weight);
            System.out.println(jane.age);
            System.out.println(jane.height);

            Person jason = new Person(50,1.5,90); 
            System.out.println(jason.weight);
            System.out.println(jason.age);
            System.out.println(jason.height);
            
            Person god = new Person (50, 1.5, 15);
            Person virginMary = new Person(60, 1.7, 15);

            // this is object orientation
            System.out.println(god.calculateBMI());
            System.out.println(virginMary.calculateBMI());

    } 
}
