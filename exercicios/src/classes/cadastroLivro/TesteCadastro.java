package classes.cadastroLivro;

public class TesteCadastro {
    public static void main(String[] args) {

        Livro livro = new Livro();

        livro.autores = new String[10];

        livro.autores[0] = "Maria";
        livro.autores[1] = "João";
        livro.assunto = "Auto-ajuda";
        livro.data = 2015;
        livro.nome = "O livro bom de ler";
    }
}