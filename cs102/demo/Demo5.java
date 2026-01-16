/*
 * Precedence & associativity
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 * 
 */
public class Demo5 {
    public static void main(String[] args) {
        {
            // modulo
            // numerator < denominator
            // numerator of 0
            // denominator of 0
            System.out.println( 3 % 5);
            System.out.println( 0 % 5);
            //System.out.println( 3 % 0); arithmetic error , trying to divide something by 0

        }
        {   // + operator
            int sum = 1 + 2 * 3;
            System.out.println(sum);
            System.out.println(1 + 2 + 3);
            System.out.println(1 + "2" + 3);
            System.out.println(1 + 2 + "3");
            System.out.println("1" + 2 + 3);
        }
        {
            // addition/concatenation
        }
    }
}
