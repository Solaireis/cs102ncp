/**
 * Describe the primitive data types
 * byte     8 bits  (                        -128 to                       127)
 * short    16 bits (                     -32,768 to                    32,767)
 * int      32 bits (              -2,147,483,648 to             2,147,483,647)
 * long     64 bits (- 9, 223,372,036,854,780,000 to 9,223,372,036,854,780,000)
 * 
 * float    32 bits ( 1.4E-45 to           3.4028235E+38)
 * double   64 bits (4.9E-324 to 1.7976931348623157E+308)
 * 
 * boolean  true, false
 * char     16 bits (0 to 65,535)
 * 
 */

public class Demo3 {
    public static void main(String[] args) {
        // <type> <name>;
        // <type> <name> = <value>;
        int x; //local variable must be initialised before use

        int y = 2;
        //System.out.println(x); 
        //error variable x is not initialised

        // examples of char declaration
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // examples of boolean declaration

        char c = 'c';
        char b = '\u0048'; // unicode includes chinese korean etc
        String s = "abcdef";

        System.out.println(b); 
        boolean isHappy = true; // this is a true boolean where it only can be true or false
        //naming convention for boolean is isHappy or isSad etc
        System.out.println(isHappy);

       
    }
}
