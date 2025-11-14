package rekord;

import java.util.HashSet;

public class TestRecord {
    static void main() {
        Komputer k1 = new Komputer("Dell", "XPS", 2022);
        Komputer k2 = new Komputer("Dell", "XPS", 2022);
        Komputer k3 = new Komputer("HP", "Pavilion", 2021);

        IO.println("k1: " + k1);
        IO.println("k2: " + k2);
        k1.equals(k2);
        k1.hashCode();
        // inne testy
        Komputer k4 = new Komputer("Lenovo", "HYP", 2025);
        Komputer k5 = k4.copy(null, "Latitude", -1);

        IO.println("k4: " + k4);
        IO.println("k5: " + k5);
        

        // HashSet
        HashSet<Komputer> set = new HashSet<>();
        set.add(k4);
        set.add(k5);
        set.add(new Komputer("Lenovo", "HYP", 2025)); // nie dodany, bo equals/hashCode takie same jak k4

        IO.println("Zawartość HashSet:");
        for (Komputer k : set) {
            System.out.println(k);
        }
    }
}
