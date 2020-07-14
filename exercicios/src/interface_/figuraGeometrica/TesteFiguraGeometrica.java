package interface_.figuraGeometrica;

public interface TesteFiguraGeometrica {

    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        q1.setLado(2);
        q1.setNome("Quadrado");

        Circulo c1 = new Circulo();
        c1.setRaio(2);
        c1.setNome("Circulo");

        Triangulo t1 = new Triangulo();
        t1.setAltura(2);
        t1.setBase(3);
        t1.setNome("Triãngulo");

        Cubo cb1 = new Cubo();
        cb1.setLado(3);
        cb1.setNome("Cubo");

        Cilindro cl1 = new Cilindro();
        cl1.setAltura(3);
        cl1.setRaio(2);
        cl1.setNome("Cilindro");

        Piramide p1 = new Piramide();
        p1.setAltura(3);
        p1.setApotema(4);
        p1.setArestaBase(2);
        p1.setNumPoliBase(4);
        p1.setBase(q1);
        p1.setNome("Pirâmide");

        // Upcasting
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = q1;
        figuras[1] = c1;
        figuras[2] = t1;
        figuras[3] = cb1;
        figuras[4] = cl1;
        figuras[5] = p1;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("----------------");
            System.out.println(figura.getNome());

            // Downcasting
            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }

            // Downcasting
            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }
    }
}