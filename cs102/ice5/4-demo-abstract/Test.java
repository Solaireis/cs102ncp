
import java.util.*;

// 4. Abstract methods vs empty methods
// 8. Interface/Abstract class as data Types
public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        for (Animal anAnimal : animals) {
            anAnimal.makeNoise();
        }
    }
}