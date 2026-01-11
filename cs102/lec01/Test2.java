import java.util.*;

public class Test2{
    public static void main(String[] args){

        int x=3;
        // value of x stores 3 
        String s = "abc";
        // S stores the value of the address which contains 'abc'
        System.out.println(x);
        System.out.println(s);
        s = "def";
        System.out.println(s);

        // string is a reference type, for other reference type you would have to make a new scanner object
        // ofcourse we would need a class first
        // dont do this
        if (s == "def"){
            System.out.println("phat fuck");
        }
         //do this instead
        if (s.equals("def")){
            System.out.println("phat fuck");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n(int): ");
        int n = sc.nextInt();
        System.out.println(n);

        // next scanner
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter n(string): ");
        String n2 = sc2.nextLine();
        System.out.println(n2);  
        System.out.print("Checking if magic word was said \n\n"); 
        System.out.println(n2.equals("phat fuck"));   
        // == check address whether same
        // .equals check for whether the content is same
    }
}