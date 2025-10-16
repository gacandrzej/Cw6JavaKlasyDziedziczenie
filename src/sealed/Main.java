package sealed;


public class Main {
    void main() {
        Komputer komputer = new Komputer("Asus", "AX25", 2024);
        //  komputer.model = "sdfsd"; // pole public, ŹLE !!!
        Komputer pc2 = new Komputer();
        // settery
        pc2.setProducent("HP");
        pc2.setModel("QW23");
        pc2.setRokProdukcji(2025);

        // gettery
        /*IO.println("producent: " + pc2.getProducent()
                + "\nmodel: " + pc2.getModel()
                + "\nrok produkcji: " + pc2.getRokProdukcji()
        );*/
        IO.println(komputer.toString());
        IO.println(pc2.toString());
        // test klasy Laptop
        Komputer laptop = new Laptop("Lenovo", "GPX2", 2023, 1.6, 3, 6.5f); // Ctrl + P
        IO.println(laptop.toString());

        // z konstruktorem bezargumentowym
        Laptop laptop2 = new Laptop();
        laptop2.setProducent("Samsung");
        laptop2.setModel("XCV");
        laptop2.setRokProdukcji(2026);
        laptop2.setWaga(2.2);
        laptop2.setIloscPortowUSB(4);
        laptop2.setCzasPracyNaBaterii(10.3f);

        // wypisanie, korzystamy z metody toString()
        IO.println(laptop2.toString());

        // testujemy polimorfizm
        komputer.włacz();
        pc2.włacz();
        IO.println(System.lineSeparator());
        laptop.włacz();
        laptop2.włacz();

        // Smartfon
        Komputer smartfon = new Smartfon("Google", "Pixel 10 Pro", 2025, "Android", 8);
        Smartfon smartfon2 = new Smartfon("Apple", "17 Pro", 2025, "Apple IOS", 16);
       smartfon2.setProducent("Apple");
       smartfon2.setModel("17 Pro");
       smartfon2.setRokProdukcji(2025);
       smartfon2.setSystemOperacyjny("ios 17");
       smartfon2.setIlośćPamięci(16);

    IO.println(smartfon.toString());
    IO.println(smartfon2.toString());
    smartfon.włacz();
    smartfon2.włacz();
    }
}