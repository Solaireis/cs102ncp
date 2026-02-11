// 1. Variable Types vs Object Types
// +-----------------+
// |     Student     |
// +-----------------+
// | - mug()         |
// | - prompt()      |
// +--------+--------+
//          ^
//         +-+
//          | 
// +--------+--------+
// |   SMUStudent    |
// +-----------------+
// | - mug()         |
// | - present()     |
// +-----------------+

public class Test {
    public static void main(String[] args) {
        // will it compile?
        // will it run?
        Student s = new SMUStudent();
        s.mug();
        s.present();
    }
}