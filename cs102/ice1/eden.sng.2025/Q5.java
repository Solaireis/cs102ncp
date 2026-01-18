import java.util.Scanner;

public class Q5 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++){
            System.out.printf("%c ",'a' + count);
            count++;
            if (count > 25){
                count = 0;
            }
        }
    }
    


}