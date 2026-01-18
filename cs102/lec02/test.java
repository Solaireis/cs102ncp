package cs102.lec02;

public class test {
    public static void main(String args[]){
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
            
    } 
}
