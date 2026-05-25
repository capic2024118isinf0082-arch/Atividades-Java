import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {

        System.out.println("Biblioteca: " + nome);

        for (Livro livro : livros) {
            System.out.println("-------------------");
            livro.mostrarDetalhes();
        }
    }
}