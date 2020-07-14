package classes.cadastroAluno;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] disciplinas;
    double[][] notas;

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    double obterMedia(int indice) {
        
        double soma = 0;
        
         for (int i=0; i<notas[indice].length; i++) {
            soma += notas[indice][i];
        }
        double media = soma / 4;
        
        return media;
    }
}