package heranca.animal;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe() {
        super();
        this.setNumPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString() {
        String info = super.toString() + "\n";
        info += "Características: " + caracteristicas;
        return info;
    }
}