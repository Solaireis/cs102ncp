/**
 * Type promotion and typecasting
 * byte -> short -> int -> long -> float -> double
 *         char  -^
 */
public class Demo4 {
    public static void main(String[] args) {
        // variables must be initialized before use
        {
            
        }

        // bigger type cannot be assigned to a smaller type
        {
            byte b = 1;
            short s = 3;
            // b = s; will make error
            b = (byte) s;
        }
        {   // default type - int, double
            short x = 2;
            short y = 3;
            double d = 12.3;
            //short j = x + y; //the values of x and y are promoted to int || long + long = long
            int total = x + y;
            total = 0;
            total = 'a' + 1;
            System.out.println(total);

            long abc = 1;
            short abc2 = 2;
            long totalLong =  abc + abc2;
            System.out.println(totalLong); //short is promoted to a long, so it promotes whenever there is a length which is longer
        }

        // shorthand notation
        {
            int x = 2;
            int y = 3;
            int z = 4;
            x = x + 1;
            y = y - 2;
            z = z / 3;
            z = z * 3;
            
        }
    }
}
