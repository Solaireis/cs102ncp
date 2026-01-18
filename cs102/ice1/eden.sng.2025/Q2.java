import java.util.*;

public class Q2 {
    
    public static void main(String[] args) {
        Boolean isNotBingo = true;
        while (isNotBingo){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter First Name:");
            String name = sc.next(); //only take one value
            char firstName = name.charAt(0);
            System.out.print("Enter Second Name:");
            String name2 = sc.next(); 
            char secondName = name2.charAt(0);

            if (firstName == secondName){
                System.out.print("Bingo\n");
                isNotBingo = false;
                return;
            }
            System.out.print("Try Again\n"); 

        }
        
    }
}