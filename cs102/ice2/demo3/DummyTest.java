public class DummyTest {
    public static void main(String[] args) {
        Dummy d = new Dummy();
        System.out.printf("default value:");
        System.out.printf("byte     :%d%n", d.byteAttr);
        System.out.printf("short    :%d%n", d.shortAttr);
        System.out.printf("int      :%d%n", d.intAttr);
        System.out.printf("long     :%d%n", d.longAttr);
        System.out.printf("float    :%f%n", d.floatAttr);
        System.out.printf("double   :%f%n", d.doubleAttr);
        System.out.printf("char     :%c%n", d.charAttr);
        System.out.printf("boolean  :%s%n", d.boolAttr);
        System.out.printf("str      :%s%n", d.strAttr);         
    }
}
