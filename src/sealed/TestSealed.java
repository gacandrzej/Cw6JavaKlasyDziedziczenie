package sealed;

public class TestSealed {
    /**
     * Proste użycie pattern matching z instanceof
     * @param komputer Komputer
     */
    public static void przetworzKomputer(Komputer komputer) {
        IO.println("=== PRZETWARZANIE KOMPUTERA ===");

        // Pattern matching z instanceof
        if (komputer instanceof Laptop laptop) {
            IO.println("📦 To jest LAPTOP:");
            IO.println("   Waga: " + laptop.getWaga() + " kg");
            IO.println("   Porty USB: " + laptop.getIloscPortowUSB());
            IO.println("   Bateria: " + laptop.getCzasPracyNaBaterii() + " h");
            laptop.włacz();

        } else if (komputer instanceof Smartfon smartfon) {
            IO.println("📱 To jest SMARFON:");
            IO.println("   System: " + smartfon.getSystemOperacyjny());
            IO.println("   Pamięć: " + smartfon.getIlośćPamięci() + " GB");
            smartfon.włacz();

        } else {
            IO.println("💻 To jest ogólny KOMPUTER:");
            IO.println("   Producent: " + komputer.getProducent());
            IO.println("   Model: " + komputer.getModel());
            komputer.włacz();
        }
    }

    /**
     * Pattern matching w switch expression
     * @param komputer Komputer
     * @return String
     */
    public static String analizujKomputer(Komputer komputer) {
        return switch (komputer) {
            case Laptop laptop -> {
                String info = "💻 Laptop " + laptop.getProducent() + " " + laptop.getModel() +
                        " | Waga: " + laptop.getWaga() + "kg" +
                        " | Bateria: " + laptop.getCzasPracyNaBaterii() + "h" +
                        " | Porty USB: " + laptop.getIloscPortowUSB();
                yield info;
            }
            case Smartfon smartfon -> {
                String info = "📱 Smartfon " + smartfon.getProducent() + " " + smartfon.getModel() +
                        " | System: " + smartfon.getSystemOperacyjny() +
                        " | Pamięć: " + smartfon.getIlośćPamięci() + "GB";
                yield info;
            }
            case Komputer komp -> {
                String info = "🖥️ Komputer " + komp.getProducent() + " " + komp.getModel() +
                        " | Rok: " + komp.getRokProdukcji();
                yield info;
            }
        };
    }

    static void main() {
        Komputer laptop = new Laptop("Lenovo", "GPX2", 2023, 1.6, 3, 6.5f); // Ctrl + P

        Komputer smartfon = new Smartfon("Google", "Pixel 10 Pro", 2025, "Android", 8);

        Komputer komputer = new Komputer("Asus", "AX25", 2024);

        przetworzKomputer(laptop);
        przetworzKomputer(smartfon);
        przetworzKomputer(komputer);

        IO.println(System.lineSeparator());

        IO.println(analizujKomputer(laptop));
        IO.println(analizujKomputer(smartfon));
        IO.println(analizujKomputer(komputer));
    }
}