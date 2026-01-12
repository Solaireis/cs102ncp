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
