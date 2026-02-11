

public class ShirtTest {
    
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt('R', 85.50, "SMUgger");
        Shirt shirt2 = new Shirt('B', 90.40, "SMUgger");
        Shirt shirt3 = new Shirt ('G',77.60);

        System.out.printf("s1 same brand as s2: %b\n" ,shirt1.isSameBrand(shirt2));
        //System.out.println(isSameBrand(shirt3));
        System.out.printf("s1 same brand as s3: %b\n",shirt1.isSameBrand(shirt3));

        shirt2.setColour('R');
        //System.out.printf("Shirt[colour=%c, Price=%f, Brand= %s\n", shirt1.getColour(),shirt1.getPrice(),shirt1.getBrand());
        //System.out.printf("Shirt[colour=%c, Price=%f, Brand= %s\n", shirt2.getColour(),shirt2.getPrice(),shirt2.getBrand());
       // System.out.printf("Shirt[colour=%c, Price=%f, Brand= %s\n", shirt3.getColour(),shirt3.getPrice(),shirt3.getBrand());
        System.out.println(shirt1.toString());
        System.out.println(shirt2.toString());
        System.out.println(shirt3.toString());
    }   
}
