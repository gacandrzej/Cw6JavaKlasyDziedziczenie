package komputery;

import java.util.Objects;

public class Komputer {
    private String producent;
    private String model;
    private int rokProdukcji;

    public Komputer() {
    }

    // Alt + insert i wybrać Construktor, zaznaczyć wszystkie pola
    public Komputer(String producent, String model, int rokProdukcji) {
        this.producent = producent;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    // Alt + insert - tworzymy gettery/settery
    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "Komputer{" +
                "producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }

    // polimorfizm
    public void włacz(){ IO.println("Komputer się uruchamia ...");}


    public Komputer copy(String producent, String model, int rokProdukcji) {
        return new Komputer(
                producent != null ? producent : this.producent,
                model != null ? model : this.model,
                rokProdukcji >= 0 ? rokProdukcji : this.rokProdukcji
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // ten sam obiekt w pamięci
        if (!(o instanceof Komputer)) return false; // inny typ
        Komputer komputer = (Komputer) o;
        return rokProdukcji == komputer.rokProdukcji &&
                Objects.equals(producent, komputer.producent) &&
                Objects.equals(model, komputer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, model, rokProdukcji);
    }

}
