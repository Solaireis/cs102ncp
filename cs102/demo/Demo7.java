// Scanner
import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        // In Java, two kinds of variable
        // Primitive data type (8) bye short int long float double char boolean
        // refernece data type
        // String
        System.out.print("Apple "); // print("apple", end ='') || printf();
        System.out.println("Apple2 "); //  print("") || printf("\n");
        float f = 1.1F; // creates a float, -> double
        System.out.printf("%s %d |%9.2f| \n", "apple", 1, f); // printf -> || print(f'{x}') f-string for python


        Scanner sc = new Scanner(System.in);
        // next next int netx float /next double
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.println("age is " + age);
        System.out.println();
        
        sc.nextLine(); //read and discard so make sure this is done to prevent it 

        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.println("name is " + name);
        System.out.println();
        //use primitive data type over reference data type
        
        System.out.print("Enter name:");
        String name2 = sc.next(); //only take one value
        System.out.println("name is " + name2);
        System.out.println();
        //use primitive data type over reference data type
    
        
    }    
}
