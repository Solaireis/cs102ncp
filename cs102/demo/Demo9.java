// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Math.html
public class Demo9 {
    public static void main(String[] args) {
        {
            // string to <primitive>
            String s1 = "true";
            String s2 = "123";
            System.out.println(Boolean.parseBoolean(s1));
            System.out.println(Integer.parseInt(s2)); // class Integer

        }
        {   // <primitive> to string>
            int x = 123;
            boolean b = true;
           //System.out.println(Integer.parseInt(s2)); // class Integer 
           System.out.println(String.valueOf(x)); // class Integer
           System.out.println(String.valueOf(b)); // class Integer
           System.out.println("" + x); // class Integer
           System.out.println("" + b); // class Integer
        }


    }
}
