package alpha;

import beta.*;

public class SMUStudent extends Student {
    public SMUStudent() { // sub-class
        this.age = 4; // inaccessible bec it is package-default
    }
}