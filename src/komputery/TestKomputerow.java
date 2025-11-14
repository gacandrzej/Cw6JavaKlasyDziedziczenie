package komputery;

import java.util.HashSet;
import java.util.Set;

public class TestKomputerow {

    public static void main(String[] args) {

        // Tworzymy kilka obiektów
        Komputer k1 = new Komputer("Dell", "XPS", 2022);
        Komputer k2 = new Komputer("Dell", "XPS", 2022);
        Komputer k3 = new Komputer("HP", "Pavilion", 2021);

        // Wyświetlamy
        IO.println("k1: " + k1);
        IO.println("k2: " + k2);
        IO.println("k3: " + k3);
        IO.println();

        // --- equals() ---
        IO.println("k1.equals(k2): " + k1.equals(k2)); // true
        IO.println("k1.equals(k3): " + k1.equals(k3)); // false
        IO.println();

        // --- hashCode() ---
        IO.println("hashCode k1: " + k1.hashCode());
        IO.println("hashCode k2: " + k2.hashCode());
        IO.println("hashCode k3: " + k3.hashCode());
        IO.println();

        // --- HashSet ---
        Set<Komputer> set = new HashSet<>();
        set.add(k1);
        set.add(k2); // nie zostanie dodany, bo equals == true
        set.add(k3);

        IO.println("Zawartość HashSet:");
        for (Komputer k : set) {
            IO.println(k);
        }
        IO.println();

        // --- copy() ---
        Komputer k4 = k1.copy(null, "Latitude", -1); // zmieniamy tylko model
        IO.println("k4 (kopiowany z k1, zmieniony model): " + k4);
        IO.println("k1.equals(k4): " + k1.equals(k4)); // false

        Smartfon smartfon = new Smartfon("Samsung", "Galaxy S21", 2022, "Android", 128);
                IO.println(smartfon);
    }
}
