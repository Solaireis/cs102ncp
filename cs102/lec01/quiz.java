

import java.util.*;

public class quiz{
    public static void main(String[] args){
        int x = 1;
        int y = ++x;
        System.out.println(y + 1);
        System.out.println(++y);

        //postdecrement Notice how the print statement doesnt change 
        //when the print statement is enacted so its slightly different from c
        x = 1;
        System.out.println(x++);

         //predecrement
        x = 1;
        System.out.println(++x);

        //postdecrement
        x = 1;
        y = 1;
        y = x++;
        System.out.println(y); 

        //predecrement
        x = 1;
        y = 1;
        y = ++x;
        System.out.println(y); 
    }
}