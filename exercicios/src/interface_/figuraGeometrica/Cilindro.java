package interface_.figuraGeometrica;

public class Cilindro extends Figura3D {

    private int altura;
    private int raio;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        double areaBase = Math.PI * (raio * raio) * altura;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2 * areaBase) + areaLateral;

        return areaTotal;
    }

    @Override
    public double calcularVolume() {

        return Math.PI * (raio * raio) * altura;
    }

}