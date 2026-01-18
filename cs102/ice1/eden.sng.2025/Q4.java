import java.util.Scanner;

public class Q4 {
    public static void main (String arg[]){

        //scann for the input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        //makeing the array
        int[] numArr = new int[10000]; //assume user doesnt want too much summation
        int count = 0;
        int numSum = 0;
        numArr[count] = n;

        if (n < 0){
            System.out.println("No positive number is entered");
            return;
        }

        while (n > 0){
            count++;
            

            System.out.print("Enter Number: ");
            n = sc.nextInt();

            numArr[count] = n;
        }
        
        for (int i = 0; i < count; i++){
            numSum = numSum + numArr[i];
            if(i > 0){
                System.out.print(" x ");
            }
            System.out.print(numArr[i]);

        }
        System.out.printf(" = %d\n",numSum); 
    }
}