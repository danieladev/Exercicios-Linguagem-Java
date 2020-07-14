package classes.cadastroAluno;

import java.util.Scanner;

public class TesteCadastro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Informe o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Informe a matrícula: ");
        aluno.nomeCurso = scan.next();

        aluno.disciplinas = new String[3];
        aluno.notas = new double[3][4];

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Informe o nome da disciplina " + i);
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + i);
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1));
                aluno.notas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " foi reaprovado");
            }
        }
    }
}