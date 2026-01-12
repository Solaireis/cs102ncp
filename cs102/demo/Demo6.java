// Strings

// the package that string is in 

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        // charAt(int pos)
        {
            String s = "abcd";
            System.out.printf("\"abcd\".charAt(%d) = %c\n", 1, s.charAt(1));
            System.out.printf("\"abcd\".charAt(%d) = %c\n", 3, s.charAt(3));
            System.out.println();
        }

        // indexOf
        // lastIndexOf
        {
            String s1 = "abcdef";
            String needle = "cd";
            System.out.printf("\"%s\".indexOf(%s) = %s\n", s1, needle, s1.indexOf(needle));
            System.out.println("");
        }

        // substring(end)
        // substring(start, end)
        {
        // 0123456
        // abcdefg
            String str = "abcdefg";
            System.out.printf("\"%s\".substring(%d)    = %s\n", str, 2, str.substring(2));
            System.out.printf("\"%s\".substring(%d, %d) = %s\n", str, 2, 5, str.substring(2, 5));
            System.out.println("");
        }

        // split
        {
            String str = "a,b,c,d";
            String delimiter = ",";
            String[] values = str.split(delimiter);
            System.out.printf("\"%s\".split(%s) = %s\n", str, delimiter, Arrays.toString(values));
            System.out.println("");
        }

        // join
        {
            String[] arr = {"apple", "orange", "pear"};
            System.out.printf("String.join(\"%s\", \"%s\") = %s\n", Arrays.toString(arr), ",", String.join(",", arr));
            System.out.println("");
        }

        // compareTo
        {
            String s1 = "aac";
            String s2 = "abc";
            String s3 = "abc";
            System.out.printf("\"%s\".compareTo(\"%s\") = %d%n", s1, s2, s1.compareTo(s2));
            System.out.printf("\"%s\".compareTo(\"%s\") = %d%n", s2, s1, s2.compareTo(s1));
            System.out.printf("\"%s\".compareTo(\"%s\") = %d%n", s2, s3, s2.compareTo(s3));  
            System.out.println("");
        }

        // equals
        // equalsIgnoreCase
        {
            String s1 = "abc";
            String s2 = "abc";
            String s3 = "ABC";
            System.out.printf("\"%s\".equals(\"%s\") = %b%n", s1, s2, s1.equals(s2));
            System.out.printf("\"%s\".equalsIgnoreCase(\"%s\") = %b%n", s2, s3, s2.equalsIgnoreCase(s3));   
            System.out.println();
        }

        // strip / trim
        // stripLeading
        // stripTrailing
        // StripIndent (for you to find out)
        {
            String str = "  apple orange pear    ";
            System.out.printf("\"%s\".strip()         = |%s|%n", str, str.strip());
            System.out.printf("\"%s\".stripLeading()  = |%s|%n", str, str.stripLeading());
            System.out.printf("\"%s\".stripTrailing() = |%s|%n", str, str.stripTrailing());
            System.out.println("");
        }
        
        // toUpperCase
        // toLowerCase
        {
            String str = "JuMpInG";
            System.out.printf("\"%s\".toLowerCase() = |%s|%n", str, str.toLowerCase());
            System.out.printf("\"%s\".toUpperCase() = |%s|%n", str, str.toUpperCase());
        }
    }
}
