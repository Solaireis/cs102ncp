/**
 * camel case  : camel case, you start by making the first word lowercase. Then, you capitalize the first letter of each word that follows
 * pascal case : similar to camel case just that the first letter of the first word is also capitalized.
 * snake case  : separates each word with an underscore character (_).
 * 
 * identifiers - names of classes, methods, variables.
 * class names  noun    UniversityStudent classname must be pascal casing
 * variable     noun    universityStudent  variable must be in camel case
 * method       verb    goForExchange method must be in camel case
 * 
 * Keywords: https://en.wikipedia.org/wiki/List_of_Java_keywords
 * 
 */
public class Demo2 {
    public static void main(String[] args) {
        // Java is case-sensitive
        int first = 1;
        int First = 2;
        int fIrst = 3;
        System.out.println(first);
        System.out.println(First);
        System.out.println(fIrst);
    }
}
