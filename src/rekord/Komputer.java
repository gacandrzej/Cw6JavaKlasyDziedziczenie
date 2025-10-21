package rekord;

public record Komputer(String producent, String model, int rokProdukcji) {

    public void wlacz() {
        IO.println("Komputer się uruchamia ...");
    }

    // Metoda copy — w recordzie tworzymy ręcznie
    public Komputer copy(String producent, String model, int rokProdukcji) {
        return new Komputer(
                producent != null ? producent : this.producent,
                model != null ? model : this.model,
                rokProdukcji >= 0 ? rokProdukcji : this.rokProdukcji
        );
    }
}