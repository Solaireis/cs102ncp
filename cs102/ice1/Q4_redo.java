import java.util.Scanner;

public class Q4_redo {
    


    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int numQueue = 0;
        int numQueueReverse = 0;
        int numSum = 0;
        int count = 0;

        if (n < 0){
            System.out.println("No positive number is entered");
            return;
        }

        while (n > 0){
            count++;
            numQueue = numQueue * 10 + n;

            System.out.print("Enter Number: ");
            n = sc.nextInt();

        }
        System.out.print(numQueue);
        for (int i =0; i < count; i++){
            int temp = 0;
            temp = numQueue % 10;
            numQueueReverse = numQueueReverse * 10 + temp;
            numQueue = numQueue / 10;
        }
        for (int i =0; i < count; i++){
            int temp = 0;
            temp = numQueueReverse % 10;
            numSum = numSum + temp;
            System.out.print(" x "); 
            System.out.print(temp);
            numQueueReverse = numQueueReverse / 10;
        }
    }

}
