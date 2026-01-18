import java.util.*;

public class Q3 {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = sc.nextLine();
        String[] reverseSentence = sentence.split(" "); //split the words into array

        for (int i = reverseSentence.length - 1 ; i >= 0 ; i-- ){
            System.out.printf("%s ",reverseSentence[i]);  // then print out in reverse LOL
        }
        
    }

}