package classes.curso;

public class Curso {

    public String nome;
    public String horario;
    public Professor[] professor;
    public Aluno[] aluno;

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void obterInfo() {
        System.out.println("---------INFORMAÇÕES---------");
        System.out.println("Curso: " + nome);
        System.out.println("Horário: " + horario);
        for (int i = 0; i < 2; i++) {
            System.out.println("Professor " + (i + 1) + ": " + professor[i].getNome() + " - Departamento: "
                    + professor[i].getDepartamento() + " - Email: " + professor[i].getEmail());

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + aluno[i].getNome() + " - Matrícula: "
                    + aluno[i].getMatricula() + " - Media: " + aluno[i].calcularMedia() + " - Resultado: "
                    + aluno[i].resultadoMedia(aluno[i].calcularMedia()));
        }
    }
}