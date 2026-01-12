// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html
public class Demo8 {
    public static void main(String[] args) {
        {
            int v1 = 3;
            int v2 = -3;
            System.out.printf("Math.abs(%d)  = %d%n", v1, Math.abs(v1));
            System.out.printf("Math.abs(%d) = %d%n", v2, Math.abs(v2));
            System.out.println();
        }
        {   // the ceil function rounds a number up to the nearest integer.
            System.out.println("Math.ceil(12.4) = " + Math.ceil(12.4));
            System.out.println("Math.ceil(12.5) = " + Math.ceil(12.5));
            System.out.println("Math.ceil(12.6) = " + Math.ceil(12.6));
            System.out.println();
        }

        {   // the floor function rounds a number down to the nearest integer.
            System.out.println("Math.floor(12.4) = " + Math.floor(12.4));
            System.out.println("Math.floor(12.5) = " + Math.floor(12.5));
            System.out.println("Math.floor(12.6) = " + Math.floor(12.6));
            System.out.println();
        }
        {
            System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
            System.out.println("Math.sqrt(4)   = " + Math.sqrt(4));
            System.out.println();
        }
        {
            System.out.println("Math.round(12.4) = " + Math.round(12.4));
            System.out.println("Math.round(12.5) = " + Math.round(12.5));
            System.out.println("Math.round(12.6) = " + Math.round(12.6));

        }
        

    }
}
