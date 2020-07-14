package heranca.animal;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
        this.setAmbiente("Terra");
        this.setCor("Castanho");
        this.setAlimento("Mel");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString() {
        String info = super.toString() + "\n";
        info += "Alimento: " + alimento;
        return info;
    }
}