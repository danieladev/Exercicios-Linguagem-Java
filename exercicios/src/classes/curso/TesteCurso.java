package classes.curso;

import java.util.Scanner;

public class TesteCurso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();

        System.out.println("Informe o nome do curso: ");
        String nome = scan.nextLine();
        curso.setNome(nome);
        System.out.println();

        System.out.println("Informe o horário do curso " + nome);
        String horario = scan.nextLine();
        curso.setHorario(horario);
        System.out.println();

        Professor[] professor = new Professor[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os dados do professor " + (i + 1));
            Professor prof = new Professor();

            System.out.println("Informe o nome do professor ");
            nome = scan.nextLine();
            prof.setNome(nome);
            System.out.println();

            System.out.println("Informe o departamento do professor ");
            String departamento = scan.nextLine();
            prof.setDepartamento(departamento);
            System.out.println();

            System.out.println("Informe o email do professor ");
            String email = scan.nextLine();
            prof.setEmail(email);
            System.out.println();

            professor[i] = prof;
        }
        curso.setProfessor(professor);

        Aluno[] aluno = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os dados do aluno " + (i + 1));
            Aluno aln = new Aluno();

            scan.nextLine();
            System.out.println("Informe o nome do aluno ");
            String nomeA = scan.nextLine();
            aln.setNome(nomeA);
            System.out.println();

            System.out.println("Informe a matricula ");
            String matricula = scan.nextLine();
            aln.setMatricula(matricula);
            System.out.println();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe a nota " + (j + 1));
                notas[j] = scan.nextDouble();
            }
            aluno[i] = aln;
            aluno[i].setNotas(notas);

        }
        curso.setAluno(aluno);
        curso.obterInfo();
    }
}
