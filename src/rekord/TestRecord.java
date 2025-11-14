package rekord;

import java.util.HashSet;

import static java.lang.IO.println;

public class TestRecord {

    void main() {
        Komputer k1 = new Komputer("Dell", "XPS", 2022);
        Komputer k2 = new Komputer("Dell", "XPS", 2022);
        Komputer k3 = new Komputer("HP", "Pavilion", 2021);

        println("k1: " + k1); // wywołanie toString()
        println("k2: " + k2);
        println(k1.equals(k2));
        println("k1: " + k1.hashCode());
        println("k2: " + k2.hashCode());
        // inne testy
        Komputer k4 = new Komputer("Lenovo", "HYP", 2025);
        Komputer k5 = k4.copy(null, "Latitude", -1);

        println("k4: " + k4);
        println("k5: " + k5);

        // HashSet
        HashSet<Komputer> set = new HashSet<>();
        set.add(k4);
        set.add(k5);
        set.add(new Komputer("Lenovo", "HYP", 2025)); // nie dodany, bo equals/hashCode takie same jak k4

        println("Zawartość HashSet:");
        for (Komputer k : set) {
            println(k);
        }

        println(opisUrzadzenia(k1));

    }

    public static String opisUrzadzenia(Urzadzenie urzadzenie) {
        return switch (urzadzenie) {
            case Komputer(String prod, String mod, int rok) ->
                    String.format("🖥️ Komputer %s %s (%d)", prod, mod, rok);

            case Laptop(String prod, String mod, int rok, double waga, int porty, float bateria) ->
                    String.format("💻 Laptop %s %s (%.1fkg, %dh)", prod, mod, waga, bateria);

            case Smartfon(String prod, String mod, int rok, String system, int pamiec) ->
                    String.format("📱 Smartfon %s %s (%s, %dGB)", prod, mod, system, pamiec);

           // default -> "Nieznane urządzenie: " + urzadzenie.getClass().getSimpleName();
            // BRAK default - kompilator wie że to wszystkie przypadki
        };
    }

}
