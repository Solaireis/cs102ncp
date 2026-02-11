public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();

        // static method - ClassName.MethodName
        Child.staticPrint();
        Parent.staticPrint();

        // DO NOT DO THIS .. 
        // DEMO of why we shouldnt do this
        // static method - variable.MethodName
        p.staticPrint(); // Parent p = new Child();
        // staticPrint in Parent
        Child c2 = (Child)p;
        c2.staticPrint(); // staticPrint in Child
        
        // instanceMethod varName.methodName
        c.instancePrint();   // child's instance print
        p.instancePrint();  // Child's instance print
    }
}