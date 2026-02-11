// 2. instanceof and casting
public class Test {
    public static void main(String[] args) {
        Student s1 = new SMUStudent(); // no present method
        SMUStudent s2 = new SMUStudent();
        Student s3 = new Student();

        // ((SMUStudent)s1).present();
        if (s1 instanceof SMUStudent) { // variableName instanceof DataType
            SMUStudent smu = (SMUStudent)s1;
            smu.present();
        }
        
        if (s1 instanceof SMUStudent smu) {
            smu.present();
        }
    }
}