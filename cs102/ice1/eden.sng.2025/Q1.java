public class Q1 {

    public static int sumOfDigits(int number) {
        int result = 0;
        //Boolean isNegative = false;
        if (number < 0){
            number = number * -1;
            //isNegative = true;
        }
        while(number > 0){
            result = result + number % 10;
            number = number /10;
        }

        

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
