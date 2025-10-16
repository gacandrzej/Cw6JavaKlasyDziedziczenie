package sealed;

public sealed class Komputer permits Laptop, Smartfon {
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
}
