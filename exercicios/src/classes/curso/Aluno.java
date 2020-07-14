package classes.curso;

public class Aluno {

    public String nome;
    public String matricula;
    public double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double total = 0, media;
        for (int i = 0; i < 4; i++) {
            total += notas[i];
        }
        media = total / 4;
        return media;
    }

    public String resultadoMedia(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}